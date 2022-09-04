import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import csv.setsCsv
import csv.themesCsv
import io.blackmo18.kotlin.grass.dsl.grass


@OptIn(ExperimentalStdlibApi::class)
fun main(args: Array<String>) {
    val csvSetsContent = csvReader().readAllWithHeader(setsCsv)
    val legoSetList = grass<LegoSet>().harvest(csvSetsContent)

    val csvThemesContent = csvReader().readAllWithHeader(themesCsv)
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