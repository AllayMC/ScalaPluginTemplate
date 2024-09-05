import org.allaymc.api.plugin.Plugin
import org.slf4j.LoggerFactory

class MyPlugin extends Plugin {
  val log = LoggerFactory.getLogger(getClass)
  override def onLoad(): Unit = 
    log.info("onLoad")
  override def onEnable(): Unit = 
    log.info("onEnable")
  override def onDisable(): Unit = 
    log.info("onDisable")
}