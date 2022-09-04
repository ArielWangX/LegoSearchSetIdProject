class SearchRepository(
    private val legoSetList: List<LegoSet>,
    private val legoThemesList: List<LegoTheme>
) {
    fun searchItemUseSetId (searchSetId: String) {
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