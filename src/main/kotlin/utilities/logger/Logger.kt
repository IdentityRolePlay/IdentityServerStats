package binky.utils.logger

import org.slf4j.LoggerFactory

object Logger {
    fun info(logMessage: String) {
        LoggerFactory.getLogger("Main").info(logMessage)
    }

    fun error(logMessage: String) {
        LoggerFactory.getLogger("Main").error(logMessage)
    }

    fun debug(logMessage: String) {
        LoggerFactory.getLogger("Main").debug(logMessage)
    }
}