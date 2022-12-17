package menu.model

class Coach(private val name: String) {

    private lateinit var cantEatMenus: List<Menu>
    private val menuTable = mutableMapOf<DayOfWeek, Menu>()

    fun setCantEatMenus(menus: List<Menu>) {
        cantEatMenus = menus
    }
}