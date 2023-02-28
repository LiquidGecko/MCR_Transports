package fr.liquidgecko.mcr_transports

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object MCRTransports : ModInitializer {
	private val MOD_ID = "MCRTransports"
	private val logger = LoggerFactory.getLogger("mc-redesign-transports")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
	}
}