import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import io.blackmo18.kotlin.grass.dsl.grass
import java.io.File

class SearchRepository {
    @OptIn(ExperimentalStdlibApi::class)
    fun searchItemUseSetId (searchSetId: String) {
        val fileSets = File("src/main/resources/sets.csv")
        val fileThemes = File("src/main/resources/themes.csv")

        val csvSetsContent = csvReader().readAllWithHeader(fileSets)
        val legoSetList = grass<LegoSet>().harvest(csvSetsContent)

        val csvThemesContent = csvReader().readAllWithHeader(fileThemes)
        val legoThemesList = grass<LegoTheme>().harvest(csvThemesContent)

        val legoSet = legoSetList.find{
           it.set_id == searchSetId
        }

        if (legoSet == null) {
            println("Oops! Sorry we don't have this product.")
            return
        } else {
            val targetThemeId = legoSet.theme_id
            val legoTheme = legoThemesList.find{
                it.id == targetThemeId
            }
            println("Name: ${legoSet.name}")
            println("Year released: ${legoSet.year}")
            println("Theme name: ${legoTheme?.name}")
            println("Number of parts: ${legoSet.num_parts}")
        }
    }
}