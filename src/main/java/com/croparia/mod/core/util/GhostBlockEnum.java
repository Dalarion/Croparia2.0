package com.croparia.mod.core.util;

import net.minecraft.util.IStringSerializable;

public enum GhostBlockEnum implements IStringSerializable {
   ANDESITE("andesite"),
   DIORITE("diorite");

   private final String translationKey;

   private GhostBlockEnum(String translationKeyIn) {
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
