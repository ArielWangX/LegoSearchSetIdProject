import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import io.blackmo18.kotlin.grass.dsl.grass
import java.io.File


fun main(args: Array<String>) {
    var search = true

    while (search) {
        println("Please enter your set id: (enter exit if you want to leave)")
        val searchSetId = readln()

        if (searchSetId == "exit") {
            break
        } else {
            SearchItemUseSetId(searchSetId)
        }
    }
}

@OptIn(ExperimentalStdlibApi::class)
fun SearchItemUseSetId (searchSetId: String) {
    val fileSets = File("src/main/resources/sets.csv")
    val fileThemes = File("src/main/resources/themes.csv")

    val csvSetsContent = csvReader().readAllWithHeader(fileSets)
    val legoSetList = grass<Sets>().harvest(csvSetsContent)

    val csvThemesContent = csvReader().readAllWithHeader(fileThemes)
    val legoThemesList = grass<Themes>().harvest(csvThemesContent)

    var hasLegoSetId = false
    var name = ""
    var yearOfReleased = ""
    var themeName = ""
    var numberOfParts = ""

    for (setOfSets in legoSetList) {
        if (setOfSets.set_id == searchSetId) {

            var targetThemeId = setOfSets.theme_id
            hasLegoSetId = true

            for (setOfThemes in legoThemesList) {
                if (setOfThemes.id == targetThemeId) {
                    themeName = setOfThemes.name
                }
            }

            name = setOfSets.name
            yearOfReleased = setOfSets.year
            numberOfParts = setOfSets.num_parts
        }
    }

    if (hasLegoSetId) {
        println("Name: $name")
        println("Year released: $yearOfReleased")
        println("Theme name: $themeName")
        println("Number of parts: $numberOfParts")
    } else {
        println("Oops! Sorry we don't have this product.")
    }
}

data class Sets(
    val set_id : String,
    val name: String,
    val year: String,
    val theme_id: String,
    val num_parts: String
)

data class Themes(
    val id: String,
    val name: String,
    val parent_id: String?
)