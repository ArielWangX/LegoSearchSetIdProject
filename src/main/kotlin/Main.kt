fun main(args: Array<String>) {
    val searchRepository = SearchRepository()

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