
        📄 YunSpells.java
```java
package yunspells;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import yunspells.listeners.PlayerListener;

```

        📄 SpellVisualizer.java (확장된 파티클 애니메이션)
```java
package yunspells.spells;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import yunspells.YunSpells;

```

        📄 SpellGUI.java (PDC + 마법 클릭 시 자동 시전)
```java
package yunspells.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import yunspells.YunSpells;
import yunspells.spells.SpellManager;

```

        📄 설명 (확장 요약)
- `SpellVisualizer`: 부드러운 **원, 선, 나선형** 파티클 추가
- `SpellGUI`: PDC 기반 마법 식별 + **GUI 클릭으로 자동 마법 시전 처리**

다음은 `SpellManager.castSpell(Player, String)`만 구현하면 전체 시전 체계가 연결됩니다!
