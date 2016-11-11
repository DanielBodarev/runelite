import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gw")
@Implements("CacheableNode")
public class CacheableNode extends Node {
   @ObfuscatedName("cx")
   @Export("previous")
   public CacheableNode previous;
   @ObfuscatedName("cr")
   @Export("next")
   public CacheableNode next;

   @ObfuscatedName("fv")
   public void method3924() {
      if(this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}