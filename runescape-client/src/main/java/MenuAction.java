import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 120335157
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 175747701
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1628688501
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1421448927
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("t")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 12768

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1427914294"
	)
	public static void method1961() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 58
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 59
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 61
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 62
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 63
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 64
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 65
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 66
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 67
		}
	} // L: 69

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "33"
	)
	public static long method1960(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 60
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1808275608"
	)
	static final void method1959(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 111
			for (int var4 = 0; var4 < 8; ++var4) { // L: 112
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 114
			for (var3 = 1; var3 < 8; ++var3) { // L: 115
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 117
			for (var3 = 1; var3 < 8; ++var3) { // L: 118
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 120
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 121
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 122
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 123
}
