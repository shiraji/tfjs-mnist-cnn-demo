import org.w3c.dom.HTMLElement
import org.w3c.dom.asList
import kotlin.browser.document

fun greet() = "Hello"

@JsName("sayHello")
fun greet(text: String) {

}

@JsName("reset")
fun reset() {
    val elements = document.querySelectorAll(".accuracy")
    elements.asList().forEach {
        (it.parentNode as? HTMLElement)?.classList?.remove("is-selected")
        (it as? HTMLElement)?.innerText = "clear"
    }
}