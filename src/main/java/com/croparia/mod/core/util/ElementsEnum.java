package com.croparia.mod.core.util;

import net.minecraft.util.IStringSerializable;

public enum ElementsEnum implements IStringSerializable {
   EMPTY("empty"),
   ELEMENTAL("elemental"),
   WATER("water"),
   AIR("air"),
   FIRE("fire"),
   EARTH("earth"),
   BLOOD("blood"),
   TIME("time");

   private final String translationKey;

   private ElementsEnum(String translationKeyIn) {
      this.translationKey = translationKeyIn;
   }

   public String getTranslationKey() {
      return this.translationKey;
   }

	@Override
	public String getString() {
		return this.translationKey;
	}
}
