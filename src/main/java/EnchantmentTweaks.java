import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantmentTweaks implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("EnchantmentTweaks");

    @Override
    public void onInitialize() {
        LOGGER.info("EnchantmentTweaks Loaded!");
    }
}
