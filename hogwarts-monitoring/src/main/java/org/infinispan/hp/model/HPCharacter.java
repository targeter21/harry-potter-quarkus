package org.infinispan.hp.model;

import java.util.Objects;

/**
 * Harry Potter saga character
 */
public class HPCharacter {
   private final int id;
   private final String name;
   private final String bio;
   private final CharacterType type;

   public enum CharacterType {
      OTHER,
      STUDENT,
      TEACHER,
      MUGGLE
   }

   public HPCharacter(int id, String name, String bio, CharacterType type) {
      this.id = id;
      this.name = name;
      this.bio = bio;
      this.type = type;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      HPCharacter character = (HPCharacter) o;
      return id == character.id &&
            Objects.equals(name, character.name) &&
            Objects.equals(bio, character.bio) &&
            Objects.equals(type, character.type);
   }

   @Override
   public String toString() {
      return "Character{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", bio='" + bio + '\'' +
            ", type='" + type + '\'' +
            '}';
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, bio, type);
   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getBio() {
      return bio;
   }

   public CharacterType getType() {
      return type;
   }

   public boolean isAtHogwarts() {
      return type == CharacterType.STUDENT || type == CharacterType.TEACHER;
   }

   public boolean canDoMagic() {
      return type != CharacterType.MUGGLE;
   }
}
