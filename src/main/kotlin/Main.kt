import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import io.blackmo18.kotlin.grass.dsl.grass
import java.io.File

@OptIn(ExperimentalStdlibApi::class)
fun main(args: Array<String>) {
    val fileSets = File("src/main/resources/sets.csv")
    val fileThemes = File("src/main/resources/themes.csv")

    val csvSetsContent = csvReader().readAllWithHeader(fileSets)
    val legoSetList = grass<LegoSet>().harvest(csvSetsContent)

    val csvThemesContent = csvReader().readAllWithHeader(fileThemes)
    val legoThemesList = grass<LegoTheme>().harvest(csvThemesContent)

    val searchRepository = SearchRepository(legoSetList,legoThemesList)

    while (true) {
        println("Please enter your set id: (enter exit if you want to leave)")
        val searchSetId = readln()

        if (searchSetId == "exit") {
            break
        } else {
            searchRepository.searchItemUseSetId(searchSetId)
        }
    }
}