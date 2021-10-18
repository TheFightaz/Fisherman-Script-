#=========================================#
#|		SK/PL WYKONANY PRZEZ THEFIGHTAZ  |#
#|		ZAKAZ KOPIOWANIA!				 |#
#|		COPYRIGHT 2021©					 |#
#=========================================#

#ZMIENNE

on first join:
	set {rybyzlowione.%player%} to 0
	set {przyneta.%player%} to 0
	set {przyneta2.%player%} to 0
	set {przyneta3.%player%} to 0
	set {przyneta4.%player%} to 0
	set {rybyzlowioneperm.%player%} to 0
	set {przyneta5.%player%} to 0
variables:
	{rybyzlowione.%player%} = 0
	{rybyzlowioneperm.%player%} = 0
	{przyneta.%player%} = 0
	{przyneta2.%player%} = 0
	{przyneta3.%player%} = 0
	{przyneta4.%player%} = 0
	{przyneta5.%player%} = 0
options:
	tag: &8&l[&2&lMC&6&lSquare&f&l.pl&8&l]
	
	
#KOMENDA ---------------------------------------------------------------------------------------------------------------------------------------------------
command /rybak [<text>]:
	trigger:
		if arg 1 is not set:
			send "{@tag} &cBłąd! &7Musisz wybrać co chcesz zrobić!"
			send "&2/rybak &6pomoc &7- Wszelkie informacje o rybaku."
			send "&2/rybak &6ulepsz &7- Mozesz ulepszyc swoją wędke."
			send "&2/rybak &6sprzedaj &7- Sprzedasz złowione ryby po cenie danej u rybaka."
			send "&2/rybak &6przyneta &7- Kup przynęte, bez niej nie połowisz!"
			send "&2/rybak &6kup &7- Kupisz wędke, dzięki której będziesz mógł/a łowić rybki!"
			send "&2/rybak &6info &7- Sprawdzisz ile posiadasz &6przynęt&7/&6złowionych ryb"
		if arg 1 is "pomoc":
			send "{@tag} &7Rybak jest to dodatkowa forma zarobku poprzez łowienie ryb."
			send "&7Mozesz sprzedawać, ulepszać swoją wędkę poprzez łowienie."
			send "&2Cena &7u rybaka się zmienia co jakiś czas."
			send "&7Nie zawsze ulepszenie moze sie udać!"
			send "&7Ulepszasz i sprzedajesz bez możliwości zwrotu."
		if arg 1 is "kup":
			open chest inventory named "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK &8&l|" with 1 rows to player
			wait 2 tick
			set slot 0 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 1 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 2 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 3 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 4 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+0&8&l]" with lore "&7Twoja pierwsza wędka!" and "&7Cena &63500&2$" and "" and "&7Możliwe kilogramy do zdobycia &8[&eod &63&2kg &edo &69&2kg&8]"
			set slot 5 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 6 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 7 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 8 of player's current inventory to green stained glass pane named "&7" with lore ""
		if arg 1 is "ulepsz":
			open chest inventory named "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|" with 1 rows to player
			wait 2 tick
			set slot 0 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+1&8&l]" with lore "&7Mozesz ulepszyć tutaj swoją pierwszą wędke." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &2120kg&8]" and "" and "&7Wymagana &2przynęta &e&nKukurydza" and "&7Możliwe kilogramy do zdobycia &8[&eod &64&2kg &edo &613&2kg&8]"
			set slot 1 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+2&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &2480kg&8]" and "" and "&7Wymagana &2przynęta &e&nChleb" and "&7Możliwe kilogramy do zdobycia &8[&eod &69&2kg &edo &619&2kg&8]"
			set slot 2 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+3&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &22100kg&8]" and "" and "&7Wymagana &2przynęta &e&nChleb" and "&7Możliwe kilogramy do zdobycia &8[&eod &610&2kg &edo &626&2kg&8]"
			set slot 3 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+4&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &25100kg&8]" and "" and "&7Wymagana &2przynęta &e&nGroszek" and "&7Możliwe kilogramy do zdobycia &8[&eod &613&2kg &edo &628&2kg&8]"
			set slot 4 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+5&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &213000kg&8]" and "" and "&7Wymagana &2przynęta &e&nGroszek" and "&7Możliwe kilogramy do zdobycia &8[&eod &615&2kg &edo &632&2kg&8]"
			set slot 5 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+6&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &220000kg&8]" and "" and "&7Wymagana &2przynęta &e&nRobaki Czerwone" and "&7Możliwe kilogramy do zdobycia &8[&eod &621&2kg &edo &650&2kg&8]"
			set slot 6 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+7&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &230000kg&8]" and "" and "&7Wymagana &2przynęta &e&nRobaki Czerwone" and "&7Możliwe kilogramy do zdobycia &8[&eod &640&2kg &edo &680&2kg&8]"
			set slot 7 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+8&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &250000kg&8]" and "" and "&7Wymagana &2przynęta &e&nKulki Proteinowe" and "&7Możliwe kilogramy do zdobycia &8[&eod &670&2kg &edo &6630&2kg&8]"
			set slot 8 of player's current inventory to fishing rod named "&6Wędka &8&l[&2&l+9&8&l]" with lore "&7Mozesz ulepszyć tutaj wędke na kolejny poziom." and "&7Pamiętaj, że nie zawsze się to uda!" and "&7Twoje zebrane ryby &8[&2%{rybyzlowione.%player%}% &7/ &2100000kg&8]" and "" and "&7Wymagana &2przynęta &e&nKulki Proteinowe" and "&7Możliwe kilogramy do zdobycia &8[&eod &6210&2kg &edo &61500&2kg&8]"
		if arg 1 is "przyneta":
			open chest inventory named "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-PRZYNETA &8&l|" with 1 rows to player
			wait 2 tick
			set slot 0 of player's current inventory to wheat seeds named "&2Przynęta &eKukurydza &8[&210X&8&l]" with lore "&7Cena &6500&2$" and "" and "&7Wymagana wędka &8[&2+0 &7/ &2+1&8]"
			set slot 1 of player's current inventory to bread named "&2Przynęta &eChleb &8[&210X&8&l]" with lore "&7Cena &62000&2$" and "" and "&7Wymagana wędka &8[&2+2 &7/ &2+3&8]"
			set slot 2 of player's current inventory to kelp named "&2Przynęta &eGroszek &8[&210X&8&l]" with lore "&7Cena &63000&2$" and "" and "&7Wymagana wędka &8[&2+4 &7/ &2+5&8]"
			set slot 3 of player's current inventory to weeping vines named "&2Przynęta &eRobaki Czerwone &8[&210X&8&l]" with lore "&7Cena &65000&2$" and "" and "&7Wymagana wędka &8[&2+6 &7/ &2+7&8]"
			set slot 4 of player's current inventory to ghast tear named "&2Przynęta &eKulki Proteinowe &8[&210X&8&l]" with lore "&7Cena &68000&2$" and "" and "&7Wymagana wędka &8[&2+8 &7/ &2+9&8]"
		if arg 1 is "info":
			open chest inventory named "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-INFO &8&l|" with 1 rows to player
			wait 2 tick
			set slot 0 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 1 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 2 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 3 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 4 of player's current inventory to player head named "&6Statystyki &2Rybaka" with lore "" and "&7Złowione ryby &8[&6%{rybyzlowioneperm.%player%}% &2kg&8] [&eOgólnie&8]" and "&7Złowione ryby &8[&6%{rybyzlowione.%player%}% &2kg&8] [&eDo sprzedaży&8]" and "&7Przynęta &eKukurydza &8[&6%{przyneta.%player%}% &7/ &680&8]" and "&7Przynęta &eChleb &8[&6%{przyneta2.%player%}% &7/ &660&8]" and "&7Przynęta &eGroszek &8[&6%{przyneta3.%player%}% &7/ &650&8]" and "&7Przynęta &eRobaki Czerowne &8[&6%{przyneta4.%player%}% &7/ &640&8]" and "&7Przynęta &eKulki Proteinowe &8[&6%{przyneta5.%player%}% &7/ &630&8]"
			set slot 5 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 6 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 7 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 8 of player's current inventory to green stained glass pane named "&7" with lore ""
		if arg 1 is "sprzedaj":
			open chest inventory named "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-SKLEP &8&l|" with 1 rows to player
			wait 2 tick
			set slot 0 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 1 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 2 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 3 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 4 of player's current inventory to raw cod named "&6Sprzedaż &7ryb u &2Rybaka" with lore "&7Aktualny kurs za &61 &2kg &7ryb wynosi &63&2$" and "" and "&7Złowione ryby &8[&6%{rybyzlowione.%player%}% &2kg&8]"
			set slot 5 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 6 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 7 of player's current inventory to green stained glass pane named "&7" with lore ""
			set slot 8 of player's current inventory to green stained glass pane named "&7" with lore ""
#ANULOWANIE ---------------------------------------------------------------------------------------------------------------------------------------------------
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK &8&l|":
		cancel event
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		cancel event
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-PRZYNETA &8&l|":
		cancel event
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-INFO &8&l|":
		cancel event
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-SKLEP &8&l|":
		cancel event
#KUPNO PIERWSZA WEDKA ---------------------------------------------------------------------------------------------------------------------------------------------------
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK &8&l|":
		clicked slot is 4:
			if player's balance is greater than or equal to 3500:
				remove 3500 from player's balance
				send "{@tag} &aPomyślnie zakupiłeś wędke!"
				wait 5 ticks
				add 1 fishing rod named "&6Wędka &8&l[&2&l+0&8&l]" with lore "&7Twoja pierwsza wędka!" to player's inventory 
			else:
				send "{@tag} &cNie masz tyle pieniędzy aby kupic &6Wędka &8&l[&2&l+0&8&l]"
#PRZYNETY---------------------------------------------------------------------------------------------------------------------------------------------------
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-PRZYNETA &8&l|":
		clicked slot is 0:
			if {przyneta.%player%} is not bigger than 70:
				if player's balance is greater than or equal to 500:
					remove 500 from player's balance
					add 10 to {przyneta.%player%}
					send "{@tag} &aPomyślnie zakupiłeś/aś &6przynęte! &8[&2Przynęta &eKukurydza&8]"
				else:
					send "{@tag} &cNie masz tyle pieniędzy!"
			else if {przyneta.%player%} is greater than or equal to 80:
				send "{@tag} &cOsiągnąłeś/aś &6maksymalną &8[&6%{przyneta.%player%}%&7/&680&8] &cilość przynęt! &8[&2Przynęta &eKukurydza&8]" 
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-PRZYNETA &8&l|":
		clicked slot is 1:
			if {przyneta2.%player%} is not bigger than 50:
				if player's balance is greater than or equal to 2000:
					remove 2000 from player's balance
					add 10 to {przyneta2.%player%}
					send "{@tag} &aPomyślnie zakupiłeś/aś &6przynęte! &8[&2Przynęta &eChleb&8]"
				else:
					send "{@tag} &cNie masz tyle pieniędzy!"
			else if {przyneta2.%player%} is greater than or equal to 60:
				send "{@tag} &cOsiągnąłeś/aś &6maksymalną &8[&6%{przyneta2.%player%}%&7/&660&8] &cilość przynęt! &8[&2Przynęta &eChleb&8]"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-PRZYNETA &8&l|":
		clicked slot is 2:
			if {przyneta3.%player%} is not bigger than 40:
				if player's balance is greater than or equal to 3000:
					remove 3000 from player's balance
					add 10 to {przyneta3.%player%}
					send "{@tag} &aPomyślnie zakupiłeś/aś &6przynęte! &8[&2Przynęta &eGroszek&8]"
				else:
					send "{@tag} &cNie masz tyle pieniędzy!"
			else if {przyneta3.%player%} is greater than or equal to 50:
				send "{@tag} &cOsiągnąłeś/aś &6maksymalną &8[&6%{przyneta3.%player%}%&7/&650&8] &cilość przynęt! &8[&2Przynęta &eGroszek&8]"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-PRZYNETA &8&l|":
		clicked slot is 3:
			if {przyneta4.%player%} is not bigger than 30:
				if player's balance is greater than or equal to 5000:
					remove 5000 from player's balance
					add 10 to {przyneta4.%player%}
					send "{@tag} &aPomyślnie zakupiłeś/aś &6przynęte! &8[&2Przynęta &eRobaki Czerwone&8]"
				else:
					send "{@tag} &cNie masz tyle pieniędzy!"
			else if {przyneta4.%player%} is greater than or equal to 40:
				send "{@tag} &cOsiągnąłeś/aś &6maksymalną &8[&6%{przyneta4.%player%}%&7/&640&8] &cilość przynęt! &8[&2Przynęta &eRobaki Czerwone&8]"
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-PRZYNETA &8&l|":
		clicked slot is 4:
			if {przyneta5.%player%} is not bigger than 20:
				if player's balance is greater than or equal to 8000:
					remove 8000 from player's balance
					add 10 to {przyneta5.%player%}
					send "{@tag} &aPomyślnie zakupiłeś/aś &6przynęte! &8[&2Przynęta &eKulki Proteinowe&8]"
				else:
					send "{@tag} &cNie masz tyle pieniędzy!"
			else if {przyneta5.%player%} is greater than or equal to 30:
				send "{@tag} &cOsiągnąłeś/aś &6maksymalną &8[&6%{przyneta5.%player%}%&7/&630&8] &cilość przynęt! &8[&2Przynęta &eKulki Proteinowe&8]"
#UPGRADE---------------------------------------------------------------------------------------------------------------------------------------------------
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 0:
			if {rybyzlowione.%player%} is greater than or equal to 120:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+0&8&l]" with lore "&7Twoja pierwsza wędka!":
					chance of 90%:
						remove 120 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+1&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+0&8&l]" with lore "&7Twoja pierwsza wędka!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+1&8&l]" with lore "&7Wędka, która łowi więcej!" to player's inventory
						close player's inventory
						stop
					chance of 10%:
						remove 120 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+1&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+0&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 120:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&6120 &2kg&8]"
				close player's inventory
#UP-2
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 1:
			if {rybyzlowione.%player%} is greater than or equal to 480:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+1&8&l]" with lore "&7Wędka, która łowi więcej!":
					chance of 80%:
						remove 480 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+2&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+1&8&l]" with lore "&7Wędka, która łowi więcej!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+2&8&l]" with lore "&7Wędka prawdziwego rybaka!" to player's inventory
						close player's inventory
						stop
					chance of 20%:
						remove 480 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+2&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+1&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 480:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&6480 &2kg&8]"
				close player's inventory
#UP-3
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 2:
			if {rybyzlowione.%player%} is greater than or equal to 2100:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+2&8&l]" with lore "&7Wędka prawdziwego rybaka!":
					chance of 70%:
						remove 2100 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+3&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+2&8&l]" with lore "&7Wędka prawdziwego rybaka!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+3&8&l]" with lore "&7Doświadczony rybak wie co z tym zrobić!" to player's inventory
						close player's inventory
						stop
					chance of 30%:
						remove 2100 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+3&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+2&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 2100:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&62100 &2kg&8]"
				close player's inventory
#UP-4
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 3:
			if {rybyzlowione.%player%} is greater than or equal to 5100:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+3&8&l]" with lore "&7Doświadczony rybak wie co z tym zrobić!":
					chance of 70%:
						remove 5100 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+4&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+3&8&l]" with lore "&7Doświadczony rybak wie co z tym zrobić!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+4&8&l]" with lore "&7Ruszaj na lepsze ryby!" to player's inventory
						close player's inventory
						stop
					chance of 30%:
						remove 5100 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+4&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+3&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 5100:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&65100 &2kg&8]"
				close player's inventory
#UP-5
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 4:
			if {rybyzlowione.%player%} is greater than or equal to 13000:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+4&8&l]" with lore "&7Ruszaj na lepsze ryby!":
					chance of 60%:
						remove 13000 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+5&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+4&8&l]" with lore "&7Ruszaj na lepsze ryby!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+5&8&l]" with lore "&7Doświadczony rybak, to ty!" to player's inventory
						close player's inventory
						stop
					chance of 40%:
						remove 13000 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+5&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+4&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 13000:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&613000 &2kg&8]"
				close player's inventory
#UP-6
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 5:
			if {rybyzlowione.%player%} is greater than or equal to 20000:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+5&8&l]" with lore "&7Doświadczony rybak, to ty!":
					chance of 60%:
						remove 20000 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+6&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+5&8&l]" with lore "&7Doświadczony rybak, to ty!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+6&8&l]" with lore "&7Zawodowy rybak, to ty!" to player's inventory
						close player's inventory
						stop
					chance of 40%:
						remove 20000 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+6&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+5&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 20000:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&620000 &2kg&8]"
				close player's inventory
#UP-7
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 6:
			if {rybyzlowione.%player%} is greater than or equal to 30000:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+6&8&l]" with lore "&7Zawodowy rybak, to ty!":
					chance of 50%:
						remove 30000 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+7&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+6&8&l]" with lore "&7Zawodowy rybak, to ty!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+7&8&l]" with lore "&7Bogate wykształcenie rybaka!" to player's inventory
						close player's inventory
						stop
					chance of 50%:
						remove 30000 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+7&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+6&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 30000:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&630000 &2kg&8]"
				close player's inventory
#UP-8
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 7:
			if {rybyzlowione.%player%} is greater than or equal to 50000:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+7&8&l]" with lore "&7Bogate wykształcenie rybaka!":
					chance of 40%:
						remove 50000 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+8&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+7&8&l]" with lore "&7Bogate wykształcenie rybaka!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+8&8&l]" with lore "&7Ekspert do spraw wędkowania!" to player's inventory
						close player's inventory
						stop
					chance of 60%:
						remove 50000 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+8&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+7&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 50000:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&650000 &2kg&8]"
				close player's inventory
#UP-9
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-UP &8&l|":
		clicked slot is 8:
			if {rybyzlowione.%player%} is greater than or equal to 100000:
				if player has 1 fishing rod named "&6Wędka &8&l[&2&l+8&8&l]" with lore "&7Ekspert do spraw wędkowania!":
					chance of 50%:
						remove 100000 from {rybyzlowione.%player%}
						send "{@tag} &aPomyślnie udało Ci się ulepszyć wędke na &8[&6&l+9&8]&7!"
						remove 1 fishing rod named "&6Wędka &8&l[&2&l+8&8&l]" with lore "&7Ekspert do spraw wędkowania!" from player's inventory
						add 1 fishing rod named "&6Wędka &8&l[&2&l+9&8&l]" with lore "&cMistrz prawdziwego wędkowania!" to player's inventory
						close player's inventory
						stop
					chance of 50%:
						remove 100000 from {rybyzlowione.%player%}
						send "{@tag} &cNie udało Ci się ulepszyć wędki na &8[&6&l+9&8]&7!"
						close player's inventory
						stop
				else:
					send "{@tag} &cNie posiadasz przy sobie wędki &8[&6+8&8]"
					close player's inventory
			else if {rybyzlowione.%player%} is less than 100000:
				send "{@tag} &cNie masz wystarczająco złowionych ryb! &8[&6100000 &2kg&8]"
				close player's inventory
#WEDKA-START / 0 ---------------------------------------------------------------------------------------------------------------------------------------------------
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+0&8&l]" with lore "&7Twoja pierwsza wędka!":
			if {przyneta.%player%} is greater than or equal to 1:
				chance of 10%:
					set {_kilo} to 9
					send "{@tag} &aPomyślnie złowiłeś &6Karpia &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 9 to {rybyzlowione.%player%}
					add 9 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
				chance of 30%:
					set {_kilo} to 4
					send "{@tag} &aPomyślnie złowiłeś &6Sardynke &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 4 to {rybyzlowione.%player%}
					add 4 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
				chance of 100%:
					set {_kilo} to 3
					send "{@tag} &aPomyślnie złowiłeś &6Śledzia &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 3 to {rybyzlowione.%player%}
					add 3 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
				chance of 10%:
					set {_kilo} to 6
					send "{@tag} &aPomyślnie złowiłeś &6Łososia &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 6 to {rybyzlowione.%player%}
					add 6 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eKukurydza&8]"
#WEDKA-2/LEPSZA / +1 ---------------------------------------------------------------------------------------------------------------------------------------------------
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+1&8&l]" with lore "&7Wędka, która łowi więcej!":
			if {przyneta.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 5
					send "{@tag} &aPomyślnie złowiłeś &6Flądre &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 5 to {rybyzlowione.%player%}
					add 5 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
				chance of 50%:
					set {_kilo} to 7
					send "{@tag} &aPomyślnie złowiłeś &6Tuńczyka &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 7 to {rybyzlowione.%player%}
					add 7 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
				chance of 10%:
					set {_kilo} to 13
					send "{@tag} &aPomyślnie złowiłeś &6Dorsza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 13 to {rybyzlowione.%player%}
					add 13 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
				chance of 30%:
					set {_kilo} to 8
					send "{@tag} &aPomyślnie złowiłeś &6Makrele &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 8 to {rybyzlowione.%player%}
					add 8 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
				chance of 60%:
					set {_kilo} to 4
					send "{@tag} &aPomyślnie złowiłeś &6Śledzia &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 4 to {rybyzlowione.%player%}
					add 4 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eKukurydza&8]"
#WĘDKA-3/LEPSZA OD LEPSZEJ /+2 ---------------------------------------------------------------------------------------------------------------------------------------------------
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+2&8&l]" with lore "&7Wędka prawdziwego rybaka!":
			if {przyneta2.%player%} is greater than or equal to 1:
				chance of 10%:
					set {_kilo} to 16
					send "{@tag} &aPomyślnie złowiłeś &6Leszcza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 16 to {rybyzlowione.%player%}
					add 16 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 30%:
					set {_kilo} to 13
					send "{@tag} &aPomyślnie złowiłeś &6Okońia &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 13 to {rybyzlowione.%player%}
					add 13 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 100%:
					set {_kilo} to 9
					send "{@tag} &aPomyślnie złowiłeś &6Morszczuka &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 9 to {rybyzlowione.%player%}
					add 9 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 20%:
					set {_kilo} to 11
					send "{@tag} &aPomyślnie złowiłeś &6Sandacza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 11 to {rybyzlowione.%player%}
					add 11 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 5%:
					set {_kilo} to 19
					send "{@tag} &aPomyślnie złowiłeś &6Suma &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 19 to {rybyzlowione.%player%}
					add 19 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 8%:
					set {_kilo} to 17
					send "{@tag} &aPomyślnie złowiłeś &6Szczupaka &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 17 to {rybyzlowione.%player%}
					add 17 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eChleb&8]"
#WEDKA-4 / +3
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+3&8&l]" with lore "&7Doświadczony rybak wie co z tym zrobić!":
			if {przyneta2.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 10
					send "{@tag} &aPomyślnie złowiłeś &6Kraba &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 10 to {rybyzlowione.%player%}
					add 10 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 30%:
					set {_kilo} to 11
					send "{@tag} &aPomyślnie złowiłeś &6Krewetke &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 11 to {rybyzlowione.%player%}
					add 11 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 10%:
					set {_kilo} to 18
					send "{@tag} &aPomyślnie złowiłeś &6Homara &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 18 to {rybyzlowione.%player%}
					add 18 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 20%:
					set {_kilo} to 20
					send "{@tag} &aPomyślnie złowiłeś &6Ostrygi &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 20 to {rybyzlowione.%player%}
					add 20 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 5%:
					set {_kilo} to 23
					send "{@tag} &aPomyślnie złowiłeś &6Węgorza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 23 to {rybyzlowione.%player%}
					add 23 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
				chance of 8%:
					set {_kilo} to 26
					send "{@tag} &aPomyślnie złowiłeś &6Mirune &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 26 to {rybyzlowione.%player%}
					add 26 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta2.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eChleb&8]"				
#WEDKA-5 / +4
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+4&8&l]" with lore "&7Ruszaj na lepsze ryby!":
			if {przyneta3.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 13
					send "{@tag} &aPomyślnie złowiłeś &6Jesiotra &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 13 to {rybyzlowione.%player%}
					add 13 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 30%:
					set {_kilo} to 15
					send "{@tag} &aPomyślnie złowiłeś &6Brzanę &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 15 to {rybyzlowione.%player%}
					add 15 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 10%:
					set {_kilo} to 18
					send "{@tag} &aPomyślnie złowiłeś &6Pelugę &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 18 to {rybyzlowione.%player%}
					add 18 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 10%:
					set {_kilo} to 22
					send "{@tag} &aPomyślnie złowiłeś &6Golca &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 22 to {rybyzlowione.%player%}
					add 22 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 5%:
					set {_kilo} to 26
					send "{@tag} &aPomyślnie złowiłeś &6Karlika &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 26 to {rybyzlowione.%player%}
					add 26 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 4%:
					set {_kilo} to 28
					send "{@tag} &aPomyślnie złowiłeś &6Sandacza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 28 to {rybyzlowione.%player%}
					add 28 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eGroszek&8]"
#WEDKA-6 /+5
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+5&8&l]" with lore "&7Doświadczony rybak, to ty!":
			if {przyneta3.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 15
					send "{@tag} &aPomyślnie złowiłeś &6Tilapie &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 15 to {rybyzlowione.%player%}
					add 15 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 2%:
					set {_kilo} to 32
					send "{@tag} &aPomyślnie złowiłeś &6Płaszczkę &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 32 to {rybyzlowione.%player%}
					add 32 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 20%:
					set {_kilo} to 20
					send "{@tag} &aPomyślnie złowiłeś &6Głowacza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 20 to {rybyzlowione.%player%}
					add 20 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 15%:
					set {_kilo} to 23
					send "{@tag} &aPomyślnie złowiłeś &6Ciernika &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 23 to {rybyzlowione.%player%}
					add 23 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 10%:
					set {_kilo} to 26
					send "{@tag} &aPomyślnie złowiłeś &6Makrelosza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 26 to {rybyzlowione.%player%}
					add 26 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
				chance of 4%:
					set {_kilo} to 30
					send "{@tag} &aPomyślnie złowiłeś &6Czarniaka &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 30 to {rybyzlowione.%player%}
					add 30 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta3.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eGroszek&8]"				
#WEDKA-7 / +6
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+6&8&l]" with lore "&7Zawodowy rybak, to ty!":
			if {przyneta4.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 21
					send "{@tag} &aPomyślnie złowiłeś &6Gorbusza &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 21 to {rybyzlowione.%player%}
					add 21 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 30%:
					set {_kilo} to 27
					send "{@tag} &aPomyślnie złowiłeś &6Piranię &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 27 to {rybyzlowione.%player%}
					add 27 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 20%:
					set {_kilo} to 40
					send "{@tag} &aPomyślnie złowiłeś &6Amura &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 40 to {rybyzlowione.%player%}
					add 40 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 15%:
					set {_kilo} to 42
					send "{@tag} &aPomyślnie złowiłeś &6Rogatnice &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 42 to {rybyzlowione.%player%}
					add 42 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 5%:
					set {_kilo} to 50
					send "{@tag} &aPomyślnie złowiłeś &6Rozgwiazde &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 50 to {rybyzlowione.%player%}
					add 50 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 15%:
					set {_kilo} to 38
					send "{@tag} &aPomyślnie złowiłeś &6Garbika &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 38 to {rybyzlowione.%player%}
					add 38 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eRobaki Czerwone&8]"
#WEDKA-8 / +7
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+7&8&l]" with lore "&7Bogate wykształcenie rybaka!":
			if {przyneta4.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 40
					send "{@tag} &aPomyślnie złowiłeś &6Pyszczaka &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 40 to {rybyzlowione.%player%}
					add 40 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 30%:
					set {_kilo} to 60
					send "{@tag} &aPomyślnie złowiłeś &6Paku &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 60 to {rybyzlowione.%player%}
					add 60 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 20%:
					set {_kilo} to 80
					send "{@tag} &aPomyślnie złowiłeś &6Strętwe &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 80 to {rybyzlowione.%player%}
					add 80 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 15%:
					set {_kilo} to 51
					send "{@tag} &aPomyślnie złowiłeś &6Pajare &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 51 to {rybyzlowione.%player%}
					add 51 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 5%:
					set {_kilo} to 67
					send "{@tag} &aPomyślnie złowiłeś &6Barakudę &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 67 to {rybyzlowione.%player%}
					add 67 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
				chance of 15%:
					set {_kilo} to 72
					send "{@tag} &aPomyślnie złowiłeś &6Goliada &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 72 to {rybyzlowione.%player%}
					add 72 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta4.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eRobaki Czerwone&8]"
#WEDKA-9 / +8
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+8&8&l]" with lore "&7Ekspert do spraw wędkowania!":
			if {przyneta5.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 70
					send "{@tag} &aPomyślnie złowiłeś &6Kalmara &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 70 to {rybyzlowione.%player%}
					add 70 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 40%:
					set {_kilo} to 120
					send "{@tag} &aPomyślnie złowiłeś &6Małżę &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 120 to {rybyzlowione.%player%}
					add 120 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 20%:
					set {_kilo} to 90
					send "{@tag} &aPomyślnie złowiłeś &6Ośmiornicę &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 90 to {rybyzlowione.%player%}
					add 90 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 5%:
					set {_kilo} to 160
					send "{@tag} &aPomyślnie złowiłeś &6Langustę &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 160 to {rybyzlowione.%player%}
					add 160 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 15%:
					set {_kilo} to 105
					send "{@tag} &aPomyślnie złowiłeś &6Raka &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 105 to {rybyzlowione.%player%}
					add 105 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 1%:
					set {_kilo} to 630
					send "{@tag} &aPomyślnie złowiłeś &6&nRekina Polarnego &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 630 to {rybyzlowione.%player%}
					add 630 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eKulki Proteinowe&8]"
#WEDKA-9 / +9
on fishing:
	if "%fishing state%" is "CAUGHT_FISH":
		if player's tool is fishing rod named "&6Wędka &8&l[&2&l+9&8&l]" with lore "&cMistrz prawdziwego wędkowania!":
			if {przyneta5.%player%} is greater than or equal to 1:
				chance of 100%:
					set {_kilo} to 210
					send "{@tag} &aPomyślnie złowiłeś &6Jeżowca &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 210 to {rybyzlowione.%player%}
					add 210 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 4%:
					set {_kilo} to 730
					send "{@tag} &aPomyślnie złowiłeś &6&nŻarłacza Białego &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 730 to {rybyzlowione.%player%}
					add 730 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 20%:
					set {_kilo} to 430
					send "{@tag} &aPomyślnie złowiłeś &6Piranie Czerwoną &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 430 to {rybyzlowione.%player%}
					add 430 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 5%:
					set {_kilo} to 390
					send "{@tag} &aPomyślnie złowiłeś &6Uchowca &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 390 to {rybyzlowione.%player%}
					add 390 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 3%:
					set {_kilo} to 950
					send "{@tag} &aPomyślnie złowiłeś &6&nŻarłacza Tępogłowego &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 950 to {rybyzlowione.%player%}
					add 950 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
				chance of 1%:
					set {_kilo} to 1500
					send "{@tag} &aPomyślnie złowiłeś &c&nWieloryba &ao wadze &8[&6%{_kilo}% &2kg&8]"
					add 1500 to {rybyzlowione.%player%}
					add 1500 to {rybyzlowioneperm.%player%}
					remove 1 from {przyneta5.%player%}
					stop
			else:
				send "{@tag} &cSkończyła Ci się przynęta! &aWykup &cnową aby złowione ryby zaliczały &6kilogramy!"
				send "{@tag} &cNie posiadasz przy sobie przynęty &8[&eKulki Proteinowe&8]"
#SKLEP-SPRZEDAZ ---------------------------------------------------------------------------------------------------------------------------------------------------
on inventory click:
	name of player's current inventory is "&2&lMC&6&lSquare&f&l.pl &8&l| &6&lRYBAK-SKLEP &8&l|":
		clicked slot is 4:
			if {rybyzlowione.%player%} is more than 1:
				set {_stan} to {rybyzlowione.%player%}
				set {_zarobione} to ({rybyzlowione.%player%} * 3)
				add ({rybyzlowione.%player%}* 3) to balance of player
				set {rybyzlowione.%player%} to 0 
				send "{@tag} &aZa sprzedaż ryb &8[&6%{_stan}% &2kg&8]"
				send "&aotrzymujesz &8[&2+ &6%{_zarobione}% &2$&8]"
				close player's inventory
			else:
				send "{@tag} &cNie posiadasz zadnych złowionych ryb!"
				close player's inventory
#BLOK ---------------------------------------------------------------------------------------------------------------------------------------------------
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+0&8&l]" with lore "&7Twoja pierwsza wędka!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+1&8&l]" with lore "&7Wędka, która łowi więcej!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+2&8&l]" with lore "&7Wędka prawdziwego rybaka!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+3&8&l]" with lore "&7Doświadczony rybak wie co z tym zrobić!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+5&8&l]" with lore "&7Doświadczony rybak, to ty!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+6&8&l]" with lore "&7Zawodowy rybak, to ty!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+7&8&l]" with lore "&7Bogate wykształcenie rybaka!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+8&8&l]" with lore "&7Ekspert do spraw wędkowania!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on enchant:
	type of enchanted item is fishing rod named "&6Wędka &8&l[&2&l+9&8&l]" with lore "&cMistrz prawdziwego wędkowania!"
	cancel event
	send "{@tag} &cNie możesz nakładać zaklęć na wędkę!" to player
on anvil combine:
	event-item-one is fishing rod
	event-item-two is enchanted book
	cancel event
	send "{@tag} &cNie możesz tego zrobić!" to player
#TESTY ---------------------------------------------------------------------------------------------------------------------------------------------------
