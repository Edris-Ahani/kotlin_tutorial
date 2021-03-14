package course.session43

class Button: MyInterfaceListener {
    override var name: String = ""

    override fun onTouch() {
        println("Button was touched")
    }

    override fun onClick() {
        super.onClick()
        println("Button was clicked")
    }
}