package org.infinispan.hp;

import java.util.Objects;

public class MagicData {

   private String caster;
   private String spell;
   private WizardType type;

   enum WizardType {
      STUDENT, TEACHER, DEATHEATER, WIZARD
   }

   public MagicData() {

   }

   public String getCaster() {
      return caster;
   }

   public void setCaster(String caster) {
      this.caster = caster;
   }

   public String getSpell() {
      return spell;
   }

   public void setSpell(String spell) {
      this.spell = spell;
   }

   public String getType() {
      return type.name();
   }

   public void setType(String type) {
      this.type = WizardType.valueOf(type);
   }

   public boolean isInHogwarts() {
      return type == WizardType.TEACHER || type == WizardType.STUDENT;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      MagicData magicData = (MagicData) o;
      return Objects.equals(caster, magicData.caster) &&
            Objects.equals(spell, magicData.spell) &&
            type == magicData.type;
   }

   @Override
   public int hashCode() {
      return Objects.hash(caster, spell, type);
   }

   @Override
   public String toString() {
      return "MagicData{" +
            "caster='" + caster + '\'' +
            ", spell='" + spell + '\'' +
            ", type=" + type +
            '}';
   }
}
