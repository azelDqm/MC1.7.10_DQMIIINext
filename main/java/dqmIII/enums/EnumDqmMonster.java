package dqmIII.enums;

public enum EnumDqmMonster {

	DESUPISARO1(1, "DqmEntityDesupisaro1", "Desupisaro1", "BOSS", 15000, 1500, 6000, -1, 80, 8, 1000, 0.5F, true, 50, 1, 1, 1, 0, "UNKNOWN", "Desupisaro2", 1, 1, "Desupisaro2", EnumDqmMonsterAI.DESUPISARO1, EnumDqmMonsterAIrate.DESUPISARO1),
	RYUUOU(2, "DqmEntityRyuuou", "Ryuuou", "BOSS", 15000, 1500, 9000, -1, 120, 10, 1000, 0.5F, true, 50, 1, 1, 1, 0, "UNKNOWN", "Ryuuou2", 1, 1, "Ryuuou2", EnumDqmMonsterAI.RYUUOU, EnumDqmMonsterAIrate.RYUUOU),
	DESUPISARO2(3, "DqmEntityDesupisaro2", "Desupisaro2", "BOSS", 20000, 2000, 7000, -1, 115, 10, 1000, 0.5F, true, 50, 1, 1, 1, 0, "UNKNOWN", "Desupisaro3", 1, 1, "Desupisaro3", EnumDqmMonsterAI.DESUPISARO2, EnumDqmMonsterAIrate.DESUPISARO2),
	ZOMA(4, "DqmEntityZoma", "Zoma", "BOSS", 27100, 2710, 12000, -1, 115, 12, 1000, 0.5F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.ZOMA, EnumDqmMonsterAIrate.ZOMA),
	MASTERDORAGON(5, "DqmEntityMasterdoragon", "Masterdoragon", "BOSS", 27200, 2720, 14000, -1, 130, 10, 1000, 0.5F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.MASTERDORAGON, EnumDqmMonsterAIrate.MASTERDORAGON),
	RYUUOU2(6, "DqmEntityRyuuou2", "Ryuuou2", "BOSS", 25000, 2500, 10000, -1, 150, 15, 1000, 0.5F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.RYUUOU2, EnumDqmMonsterAIrate.RYUUOU2),
	ESTERK(7, "DqmEntityEsterk", "Esterk", "BOSS", 27500, 2750, 13000, -1, 170, 17, 1000, 0.5F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.ESTERK, EnumDqmMonsterAIrate.ESTERK),
	DESUPISARO3(8, "DqmEntityDesupisaro3", "Desupisaro3", "BOSS", 28000, 2800, 12000, -1, 155, 15, 1000, 0.5F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.DESUPISARO3, EnumDqmMonsterAIrate.DESUPISARO3),
	GOD(9, "DqmEntityGod", "God", "BOSS", 100000, 50000, 50000, -1, 350, 24, 10000, 0.5F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.GOD, EnumDqmMonsterAIrate.GOD),
	SURA(10, "DqmEntitySura", "Sura", "DAY", 3, 1, 5, 0, 1, 0, 2, 0.15F, false, 2, 700, 0, 1, 0, "SURAIMU", null, 1, 1, "Puremiasuraimu", EnumDqmMonsterAI.SURA, EnumDqmMonsterAIrate.SURA),
	SURAIMUBESU(11, "DqmEntitySuraimubesu", "Suraimubesu", "DAY", 4, 1, 7, 0, 1, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SURAIMU", null, 1, 1, "Puremiasuraimu", EnumDqmMonsterAI.SURAIMUBESU, EnumDqmMonsterAIrate.SURAIMUBESU),
	REMONSURAIMU(12, "DqmEntityRemonsuraimu", "Remonsuraimu", "DAY", 4, 1, 10, 0, 2, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SURAIMU", null, 1, 1, "Puremiasuraimu", EnumDqmMonsterAI.REMONSURAIMU, EnumDqmMonsterAIrate.REMONSURAIMU),
	BUBSURA(13, "DqmEntityBubsura", "Bubsura", "DAY", 4, 1, 12, 0, 2, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.BUBSURA, EnumDqmMonsterAIrate.BUBSURA),
	MOMON(14, "DqmEntityMomon", "Momon", "DAY", 3, 1, 12, 0, 2, 0, 5, 0.15F, false, 2, 700, 1, 1, 0, "AKUMA", "Kuinmomon", 1, 1, "Kuinmomon", EnumDqmMonsterAI.MOMON, EnumDqmMonsterAIrate.MOMON),
	OONAMEKUJI(15, "DqmEntityOonamekuji", "Oonamekuji", "DAY", 4, 1, 12, 0, 2, 0, 5, 0.15F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.OONAMEKUJI, EnumDqmMonsterAIrate.OONAMEKUJI),
	SIMASIMACAT(16, "DqmEntitySimasimacat", "Simasimacat", "DAY", 5, 1, 12, 0, 3, 0, 5, 0.175F, false, 2, 700, 1, 1, 0, "BEAST", "Maaburun", 1, 1, "Maaburun", EnumDqmMonsterAI.SIMASIMACAT, EnumDqmMonsterAIrate.SIMASIMACAT),
	ZINMENTYOU(17, "DqmEntityZinmentyou", "Zinmentyou", "DAY", 4, 1, 12, 0, 2, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.ZINMENTYOU, EnumDqmMonsterAIrate.ZINMENTYOU),
	BIGCROW(18, "DqmEntityBigCrow", "BigCrow", "DAY", 5, 1, 13, 0, 2, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.BIGCROW, EnumDqmMonsterAIrate.BIGCROW),
	BUTISURAIMU(19, "DqmEntityButisuraimu", "Butisuraimu", "DAY", 6, 1, 14, 0, 2, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.BUTISURAIMU, EnumDqmMonsterAIrate.BUTISURAIMU),
	DOROZARA(20, "DqmEntityDorozara", "Dorozara", "DAY", 6, 1, 14, 0, 2, 0, 5, 0.15F, false, 2, 700, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.DOROZARA, EnumDqmMonsterAIrate.DOROZARA),
	BIGGUHATTO(21, "DqmEntityBigguhatto", "Bigguhatto", "DAY", 6, 1, 15, 0, 2, 0, 5, 0.175F, false, 2, 700, 1, 1, 0, "BEAST", "Arukemisuton", 1, 1, "Arukemisuton", EnumDqmMonsterAI.BIGGUHATTO, EnumDqmMonsterAIrate.BIGGUHATTO),
	IKKAKUUSAGI(22, "DqmEntityIkkakuusagi", "Ikkakuusagi", "DAY", 8, 1, 15, 0, 3, 0, 5, 0.2F, false, 2, 700, 1, 1, 0, "BEAST", "Gorudenkon", 1, 1, "Gorudenkon", EnumDqmMonsterAI.IKKAKUUSAGI, EnumDqmMonsterAIrate.IKKAKUUSAGI),
	ITAMOGU(23, "DqmEntityItamogu", "Itamogu", "DAY", 7, 1, 15, 0, 2, 0, 5, 0.15F, false, 2, 700, 1, 1, 0, "BEAST", "Kirapike", 1, 1, "Kirapike", EnumDqmMonsterAI.ITAMOGU, EnumDqmMonsterAIrate.ITAMOGU),
	TOGEBOUZU(24, "DqmEntityTogebouzu", "Togebouzu", "DAY", 7, 1, 15, 0, 2, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.TOGEBOUZU, EnumDqmMonsterAIrate.TOGEBOUZU),
	ZUKKINYA(25, "DqmEntityZukkinya", "Zukkinya", "DAY", 7, 1, 15, 0, 2, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.ZUKKINYA, EnumDqmMonsterAIrate.ZUKKINYA),
	ONIKOZOU(26, "DqmEntityOnikozou", "Onikozou", "DAY", 8, 1, 16, 0, 3, 0, 5, 0.2F, false, 2, 700, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.ONIKOZOU, EnumDqmMonsterAIrate.ONIKOZOU),
	AYASIIKAGE(27, "DqmEntityAyasiikage", "Ayasiikage", "DAY", 10, 1, 17, 0, 5, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.AYASIIKAGE, EnumDqmMonsterAIrate.AYASIIKAGE),
	SUKIPPAA(28, "DqmEntitySukippaa", "Sukippaa", "DAY", 10, 1, 17, 0, 3, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.SUKIPPAA, EnumDqmMonsterAIrate.SUKIPPAA),
	TUKAIMA(29, "DqmEntityTukaima", "Tukaima", "DAY", 9, 1, 17, 0, 3, 0, 5, 0.175F, false, 2, 700, 1, 4, 0, "AKUMA", "Bebingosatan", 1, 1, "Bebingosatan", EnumDqmMonsterAI.TUKAIMA, EnumDqmMonsterAIrate.TUKAIMA),
	DRAGOSURAIMU(30, "DqmEntityDragosuraimu", "Dragosuraimu", "DAY", 11, 2, 18, 0, 4, 0, 5, 0.175F, false, 2, 700, 0, 4, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.DRAGOSURAIMU, EnumDqmMonsterAIrate.DRAGOSURAIMU),
	GIZUMOAZ(31, "DqmEntityGizumoAZ", "GizumoAZ", "DAY", 12, 2, 18, 0, 4, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.GIZUMOAZ, EnumDqmMonsterAIrate.GIZUMOAZ),
	MOMONJA(32, "DqmEntityMomonja", "Momonja", "DAY", 12, 2, 18, 0, 5, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.MOMONJA, EnumDqmMonsterAIrate.MOMONJA),
	OBAKEKINOKO(33, "DqmEntityObakekinoko", "Obakekinoko", "DAY", 11, 2, 18, 0, 3, 0, 5, 0.2F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.OBAKEKINOKO, EnumDqmMonsterAIrate.OBAKEKINOKO),
	RIPPUSU(34, "DqmEntityRippusu", "Rippusu", "DAY", 10, 1, 18, 0, 3, 0, 5, 0.15F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.RIPPUSU, EnumDqmMonsterAIrate.RIPPUSU),
	SURAIMUTUMURI(35, "DqmEntitySuraimutumuri", "Suraimutumuri", "DAY", 12, 2, 18, 30, 4, 0, 5, 0.15F, false, 2, 700, 1, 1, 0, "SURAIMU", "Tumurinmama", 1, 1, "Tumurinmama", EnumDqmMonsterAI.SURAIMUTUMURI, EnumDqmMonsterAIrate.SURAIMUTUMURI),
	HITOKUIKIBAKO(36, "DqmEntityHitokuikibako", "Hitokuikibako", "DAY", 30, 4, 20, 0, 10, 0, 5, 1F, false, 4, 700, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.HITOKUIKIBAKO, EnumDqmMonsterAIrate.HITOKUIKIBAKO),
	OOKIDUTI(37, "DqmEntityOokiduti", "Ookiduti", "DAY", 13, 2, 20, 0, 5, 0, 5, 0.175F, false, 2, 700, 1, 1, 0, "BEAST", "Togekonbou", 1, 1, "Togekonbou", EnumDqmMonsterAI.OOKIDUTI, EnumDqmMonsterAIrate.OOKIDUTI),
	GUNTAIGANI(38, "DqmEntityGuntaigani", "Guntaigani", "DAY", 14, 2, 22, 0, 5, 5, 5, 0.15F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.GUNTAIGANI, EnumDqmMonsterAIrate.GUNTAIGANI),
	HOIMISURA(39, "DqmEntityHoimisura", "Hoimisura", "DAY", 12, 2, 23, 9999, 5, 0, 5, 0.175F, false, 2, 700, 1, 2, 0, "SURAIMU", "Metaruhoimin", 1, 1, null, EnumDqmMonsterAI.HOIMISURA, EnumDqmMonsterAIrate.HOIMISURA),
	DOKUROARAI(40, "DqmEntityDokuroarai", "Dokuroarai", "DAY", 13, 2, 25, 0, 6, 0, 5, 0.175F, false, 2, 700, 1, 1, 0, "BEAST", "Seigin", 1, 1, "Seigin", EnumDqmMonsterAI.DOKUROARAI, EnumDqmMonsterAIrate.DOKUROARAI),
	SIBIREKURAGE(41, "DqmEntitySibirekurage", "Sibirekurage", "DAY", 14, 2, 28, 0, 6, 0, 5, 0.175F, false, 2, 700, 1, 1, 0, "SURAIMU", "Metaruhoimin", 1, 1, "Metaruhoimin", EnumDqmMonsterAI.SIBIREKURAGE, EnumDqmMonsterAIrate.SIBIREKURAGE),
	SUNOMON(42, "DqmEntitySunomon", "Sunomon", "DAY", 13, 2, 28, 0, 6, 0, 5, 0.175F, false, 4, 700, 1, 1, 0, "AKUMA", "Kuinmomon", 1, 1, "Kuinmomon", EnumDqmMonsterAI.SUNOMON, EnumDqmMonsterAIrate.SUNOMON),
	KIMERA(43, "DqmEntityKimera", "Kimera", "DAY", 16, 2, 30, 50, 6, 0, 5, 0.175F, true, 2, 700, 1, 4, 0, "SIZEN", "Moonkimera", 1, 1, "Moonkimera", EnumDqmMonsterAI.KIMERA, EnumDqmMonsterAIrate.KIMERA),
	SIRUDOKOZOU(44, "DqmEntitySirudokozou", "Sirudokozou", "DAY", 22, 3, 30, 0, 10, 5, 5, 0.2F, false, 2, 700, 1, 1, 0, "BUSSITU", "Sirudoaniki", 1, 1, "Sirudoaniki", EnumDqmMonsterAI.SIRUDOKOZOU, EnumDqmMonsterAIrate.SIRUDOKOZOU),
	OOMEDAMA(45, "DqmEntityOomedama", "Oomedama", "DAY", 13, 2, 32, 0, 6, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.OOMEDAMA, EnumDqmMonsterAIrate.OOMEDAMA),
	HITOKUISABERU(46, "DqmEntityHitokuisaberu", "Hitokuisaberu", "DAY", 17, 2, 35, 0, 9, 0, 5, 0.2F, false, 2, 700, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.HITOKUISABERU, EnumDqmMonsterAIrate.HITOKUISABERU),
	KIRIKABUOBAKE(47, "DqmEntityKirikabuobake", "Kirikabuobake", "DAY", 14, 2, 35, 0, 6, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.KIRIKABUOBAKE, EnumDqmMonsterAIrate.KIRIKABUOBAKE),
	OBAKEUMIUSI(48, "DqmEntityObakeumiusi", "Obakeumiusi", "DAY", 15, 2, 35, 0, 6, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.OBAKEUMIUSI, EnumDqmMonsterAIrate.OBAKEUMIUSI),
	RIRIPAT(49, "DqmEntityRiripat", "Riripat", "DAY", 14, 2, 35, 0, 6, 0, 5, 0.125F, false, 2, 700, 1, 1, 1, "AKUMA", "Reddoatya", 1, 1, "Reddoatya", EnumDqmMonsterAI.RIRIPAT, EnumDqmMonsterAIrate.RIRIPAT),
	SUPINI(50, "DqmEntitySupini", "Supini", "DAY", 16, 2, 35, 0, 7, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.SUPINI, EnumDqmMonsterAIrate.SUPINI),
	DORONUBA(51, "DqmEntityDoronuba", "Doronuba", "DAY", 18, 3, 38, 40, 7, 0, 5, 0.15F, false, 2, 700, 1, 1, 0, "SIZEN", "Tyokonuba", 1, 1, "Tyokonuba", EnumDqmMonsterAI.DORONUBA, EnumDqmMonsterAIrate.DORONUBA),
	EBIRUAPPLE(52, "DqmEntityEbiruapple", "Ebiruapple", "DAY", 23, 3, 38, 60, 9, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.EBIRUAPPLE, EnumDqmMonsterAIrate.EBIRUAPPLE),
	MADOHANDO(53, "DqmEntityMadohando", "Madohando", "DAY", 19, 3, 38, 0, 8, 0, 5, 0.175F, false, 2, 4, 2, 1, 0, "BUSSITU", "Madohando", 2, 3, "Madohando", EnumDqmMonsterAI.MADOHANDO, EnumDqmMonsterAIrate.MADOHANDO),
	BURAUNI(54, "DqmEntityBurauni", "Burauni", "DAY", 21, 3, 40, 0, 10, 0, 5, 0.175F, false, 4, 700, 1, 1, 0, "BEAST", "Togekonbou", 1, 1, "Togekonbou", EnumDqmMonsterAI.BURAUNI, EnumDqmMonsterAIrate.BURAUNI),
	PAPETKOZOU(55, "DqmEntityPapetkozou", "Papetkozou", "DAY", 20, 3, 40, 0, 8, 0, 5, 0.175F, false, 2, 700, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.PAPETKOZOU, EnumDqmMonsterAIrate.PAPETKOZOU),
	PURIZUNYAN(56, "DqmEntityPurizunyan", "Purizunyan", "DAY", 21, 3, 40, 50, 8, 0, 5, 0.2F, false, 2, 700, 1, 1, 0, "BEAST", "Maaburun", 1, 1, "Maaburun", EnumDqmMonsterAI.PURIZUNYAN, EnumDqmMonsterAIrate.PURIZUNYAN),
	WARAIBUKURO(57, "DqmEntityWaraibukuro", "Waraibukuro", "DAY", 20, 3, 40, 255, 8, 0, 5, 0.2F, false, 2, 700, 1, 1, 0, "BUSSITU", "Sweetbag", 1, 1, "Sweetbag", EnumDqmMonsterAI.WARAIBUKURO, EnumDqmMonsterAIrate.WARAIBUKURO),
	OOKUTIBASI(58, "DqmEntityOokutibasi", "Ookutibasi", "DAY", 24, 3, 42, 0, 8, 0, 5, 0.225F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.OOKUTIBASI, EnumDqmMonsterAIrate.OOKUTIBASI),
	SURAIMUTAWA(59, "DqmEntitySuraimutawa", "Suraimutawa", "DAY", 22, 3, 42, 0, 7, 0, 5, 0.2F, false, 4, 700, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURAIMUTAWA, EnumDqmMonsterAIrate.SURAIMUTAWA),
	UZUSIOKING(60, "DqmEntityUzusioking", "Uzusioking", "DAY", 25, 4, 42, 7, 10, 0, 5, 0.2F, false, 2, 700, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.UZUSIOKING, EnumDqmMonsterAIrate.UZUSIOKING),
	DUCKSBILL(61, "DqmEntityDucksbill", "Ducksbill", "DAY", 28, 4, 45, 30, 10, 0, 5, 0.21F, false, 8, 700, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.DUCKSBILL, EnumDqmMonsterAIrate.DUCKSBILL),
	SURAIMUNAITO(62, "DqmEntitySuraimunaito", "Suraimunaito", "DAY", 27, 4, 45, 30, 10, 0, 5, 0.225F, false, 4, 700, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURAIMUNAITO, EnumDqmMonsterAIrate.SURAIMUNAITO),
	KIRAPAN(63, "DqmEntityKirapan", "Kirapan", "DAY", 45, 6, 65, 0, 13, 0, 5, 0.275F, false, 4, 700, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.KIRAPAN, EnumDqmMonsterAIrate.KIRAPAN),
	DORUIDO(64, "DqmEntityDoruido", "Doruido", "DAY", 20, 5, 40, 20, 8, 0, 5, 0.125F, false, 4, 700, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.DORUIDO, EnumDqmMonsterAIrate.DORUIDO),
	FARATTO(65, "DqmEntityFaratto", "Faratto", "DAY", 18, 4, 30, 0, 7, 0, 5, 0.175F, false, 4, 700, 1, 1, 0, "BEAST", "Pinkbonbon", 1, 1, "Pinkbonbon", EnumDqmMonsterAI.FARATTO, EnumDqmMonsterAIrate.FARATTO),
	GAIKOTU(66, "DqmEntityGaikotu", "Gaikotu", "DAY", 21, 3, 60, 0, 15, 1, 5, 0.2F, false, 4, 700, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.GAIKOTU, EnumDqmMonsterAIrate.GAIKOTU),
	SABOTENBORU(67, "DqmEntitySabotenboru", "Sabotenboru", "DAY", 18, 5, 31, 0, 10, 0, 5, 0.175F, false, 4, 700, 1, 1, 0, "SIZEN", "Sabotengold", 1, 1, "Sabotengold", EnumDqmMonsterAI.SABOTENBORU, EnumDqmMonsterAIrate.SABOTENBORU),
	GORUDENSURAIMU(68, "DqmEntityGorudensuraimu", "Gorudensuraimu", "END", 600, 300, 180, 0, 70, 15, 50, 0.3F, true, 25, 300, 0, 1, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.GORUDENSURAIMU, EnumDqmMonsterAIrate.GORUDENSURAIMU),
	PANDORABOX(69, "DqmEntityPandorabox", "Pandorabox", "END", 750, 170, 318, 80, 80, 0, 50, 0.25F, true, 22, 300, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.PANDORABOX, EnumDqmMonsterAIrate.PANDORABOX),
	BATORUREX(70, "DqmEntityBatorurex", "Batorurex", "END", 1300, 110, 310, 0, 85, 0, 50, 0.225F, true, 10, 300, 0, 4, 0, "DRAGON", null, 1, 1, "Masso", EnumDqmMonsterAI.BATORUREX, EnumDqmMonsterAIrate.BATORUREX),
	AKAIRAI(71, "DqmEntityAkairai", "Akairai", "END", 550, 79, 280, 8, 55, 0, 50, 0.225F, false, 10, 300, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.AKAIRAI, EnumDqmMonsterAIrate.AKAIRAI),
	DASUDRAGON(72, "DqmEntityDasudragon", "Dasudragon", "END", 580, 83, 260, 0, 58, 0, 50, 0.225F, false, 10, 300, 0, 4, 0, "DRAGON", null, 1, 1, "Yamatanooroti", EnumDqmMonsterAI.DASUDRAGON, EnumDqmMonsterAIrate.DASUDRAGON),
	DESUJAKKARU(73, "DqmEntityDesujakkaru", "Desujakkaru", "END", 650, 93, 300, 10, 62, 0, 50, 0.275F, false, 10, 300, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.DESUJAKKARU, EnumDqmMonsterAIrate.DESUJAKKARU),
	RYUISO(74, "DqmEntityRyuiso", "Ryuiso", "END", 680, 97, 320, 0, 60, 0, 50, 0.3F, false, 32, 300, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.RYUISO, EnumDqmMonsterAIrate.RYUISO),
	KAGENOKISI(75, "DqmEntityKagenokisi", "Kagenokisi", "END", 750, 107, 330, 99, 65, 0, 50, 0.275F, false, 25, 300, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.KAGENOKISI, EnumDqmMonsterAIrate.KAGENOKISI),
	DAKUNAITO(76, "DqmEntityDakunaito", "Dakunaito", "END", 1000, 143, 350, 0, 75, 0, 50, 0.35F, false, 10, 300, 1, 1, 0, "UNDEAD", "Goldmanto", 1, 1, "Sirubamanto", EnumDqmMonsterAI.DAKUNAITO, EnumDqmMonsterAIrate.DAKUNAITO),
	GAMEGONREJENDO(77, "DqmEntityGamegonrejendo", "Gamegonrejendo", "END", 1100, 157, 365, 0, 65, 10, 50, 0.225F, false, 25, 300, 0, 1, 0, "DRAGON", null, 1, 1, "Yamatanooroti", EnumDqmMonsterAI.GAMEGONREJENDO, EnumDqmMonsterAIrate.GAMEGONREJENDO),
	DENGA(78, "DqmEntityDenga", "Denga", "END", 1100, 157, 380, 60, 68, 5, 50, 0.15F, false, 25, 300, 0, 1, 0, "SURAIMU", null, 1, 1, "Suraimujeneraru", EnumDqmMonsterAI.DENGA, EnumDqmMonsterAIrate.DENGA),
	DRAGONDARKNAITO(79, "DqmEntityDragondarknaito", "Dragondarknaito", "END", 1300, 186, 430, 0, 75, 0, 50, 0.275F, false, 25, 300, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.DRAGONDARKNAITO, EnumDqmMonsterAIrate.DRAGONDARKNAITO),
	BIGGUMOAI(80, "DqmEntityBiggumoai", "Biggumoai", "END", 1250, 179, 450, 0, 70, 0, 50, 0.225F, false, 10, 300, 0, 1, 0, "BUSSITU", null, 1, 1, "Godonheddo", EnumDqmMonsterAI.BIGGUMOAI, EnumDqmMonsterAIrate.BIGGUMOAI),
	GODRAIDA(81, "DqmEntityGodraida", "Godraida", "END", 1300, 186, 450, 72, 72, 5, 50, 0.35F, false, 20, 300, 0, 1, 0, "SURAIMU", null, 1, 1, "Suraimujeneraru", EnumDqmMonsterAI.GODRAIDA, EnumDqmMonsterAIrate.GODRAIDA),
	GIGANTESU(82, "DqmEntityGigantesu", "Gigantesu", "END", 1350, 193, 480, 0, 75, 0, 50, 0.25F, false, 25, 300, 0, 1, 0, "AKUMA", null, 1, 1, "Atorasu", EnumDqmMonsterAI.GIGANTESU, EnumDqmMonsterAIrate.GIGANTESU),
	BASSAIMASIN(83, "DqmEntityBassaimasin", "Bassaimasin", "END", 900, 125, 340, 0, 70, 0, 50, 0.2F, false, 25, 300, 1, 1, 0, "BUSSITU", "Taipug", 1, 1, "Kiramajinga", EnumDqmMonsterAI.BASSAIMASIN, EnumDqmMonsterAIrate.BASSAIMASIN),
	BURIZADO(84, "DqmEntityBurizado", "Burizado", "END", 1100, 158, 240, 30, 58, 0, 50, 0.15F, false, 25, 300, 0, 1, 0, "BUSSITU", null, 1, 1, "Fureizado", EnumDqmMonsterAI.BURIZADO, EnumDqmMonsterAIrate.BURIZADO),
	DARKTORORU(85, "DqmEntityDarktororu", "Darktororu", "END", 1120, 20, 500, 30, 80, 0, 50, 0.1F, false, 10, 300, 0, 1, 0, "AKUMA", null, 1, 1, "Tororubakkosu", EnumDqmMonsterAI.DARKTORORU, EnumDqmMonsterAIrate.DARKTORORU),
	DESUNYAGO(86, "DqmEntityDesunyago", "Desunyago", "END", 650, 93, 300, 0, 62, 0, 50, 0.275F, false, 10, 300, 1, 1, 0, "BEAST", "Maaburun", 1, 1, "Maaburun", EnumDqmMonsterAI.DESUNYAGO, EnumDqmMonsterAIrate.DESUNYAGO),
	JIGOKUNOYOROI(87, "DqmEntityJigokunoyoroi", "Jigokunoyoroi", "END", 750, 107, 330, 0, 65, 0, 50, 0.275F, false, 25, 300, 1, 1, 0, "BUSSITU", "Shuvaluts", 1, 1, "Kandatakobun", EnumDqmMonsterAI.JIGOKUNOYOROI, EnumDqmMonsterAIrate.JIGOKUNOYOROI),
	MANEMANE(88, "DqmEntityManemane", "Manemane", "END", 800, 110, 340, 0, 65, 0, 50, 0.2F, false, 25, 300, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.MANEMANE, EnumDqmMonsterAIrate.MANEMANE),
	TORORUBONBA(89, "DqmEntityTororubonba", "Tororubonba", "END", 1210, 20, 610, 0, 75, 0, 50, 0.1F, false, 10, 300, 0, 1, 0, "AKUMA", null, 1, 1, "Tororubakkosu", EnumDqmMonsterAI.TORORUBONBA, EnumDqmMonsterAIrate.TORORUBONBA),
	DAKUHOBITTO(90, "DqmEntityDakuhobitto", "Dakuhobitto", "END", 850, 121, 330, 0, 63, 10, 50, 0.225F, false, 10, 300, 0, 1, 0, "BUSSITU", null, 1, 1, "Uragirikozou", EnumDqmMonsterAI.DAKUHOBITTO, EnumDqmMonsterAIrate.DAKUHOBITTO),
	GIZUMO(91, "DqmEntityGizumo", "Gizumo", "ETC", 9, 1, 18, 0, 4, 0, 5, 0.175F, false, 2, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.GIZUMO, EnumDqmMonsterAIrate.GIZUMO),
	TUBO(92, "DqmEntityTubo", "Tubo", "ETC", 30, 4, 20, 0, 10, 0, 5, 0.5F, false, 4, 1000, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.TUBO, EnumDqmMonsterAIrate.TUBO),
	HIITOGIZUMO(93, "DqmEntityHiitogizumo", "Hiitogizumo", "ETC", 26, 4, 45, 0, 9, 0, 15, 0.175F, true, 2, 1000, 0, 4, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.HIITOGIZUMO, EnumDqmMonsterAIrate.HIITOGIZUMO),
	FUROSUTOGIZUMO(94, "DqmEntityFurosutogizumo", "Furosutogizumo", "ETC", 33, 5, 60, 0, 10, 0, 15, 0.2F, false, 2, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.FUROSUTOGIZUMO, EnumDqmMonsterAIrate.FUROSUTOGIZUMO),
	SURAIMUKING(95, "DqmEntitySuraimuking", "Suraimuking", "ETC", 40, 6, 75, 0, 12, 0, 15, 0.2F, false, 8, 5, 1, 1, 0, "SURAIMU", "Sura", 5, 7, null, EnumDqmMonsterAI.SURAIMUKING, EnumDqmMonsterAIrate.SURAIMUKING),
	HITOKUIBAKO(96, "DqmEntityHitokuibako", "Hitokuibako", "ETC", 80, 11, 80, 0, 12, 0, 15, 0.275F, false, 10, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.HITOKUIBAKO, EnumDqmMonsterAIrate.HITOKUIBAKO),
	MIMIKKUKIBAKO(97, "DqmEntityMimikkukibako", "Mimikkukibako", "ETC", 60, 9, 80, 0, 20, 0, 15, 0.5F, false, 8, 1000, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.MIMIKKUKIBAKO, EnumDqmMonsterAIrate.MIMIKKUKIBAKO),
	PANDORAKIBAKO(98, "DqmEntityPandorakibako", "Pandorakibako", "ETC", 350, 50, 220, 0, 55, 0, 30, 0.5F, true, 22, 1000, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.PANDORAKIBAKO, EnumDqmMonsterAIrate.PANDORAKIBAKO),
	NOROWARETATURUGI(99, "DqmEntityNorowaretaturugi", "Norowaretaturugi", "ETC", 30000, 3000, 5000, 0, 200, 22, 1000, 0.5F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.NOROWARETATURUGI, EnumDqmMonsterAIrate.NOROWARETATURUGI),
	KINGBESU(100, "DqmEntityKingbesu", "Kingbesu", "ETC", 50, 8, 70, 0, 13, 0, 15, 0.2F, false, 8, 5, 1, 1, 0, "SURAIMU", "Suraimubesu", 5, 7, null, EnumDqmMonsterAI.KINGBESU, EnumDqmMonsterAIrate.KINGBESU),
	MIMIKKU(101, "DqmEntityMimikku", "Mimikku", "HELL", 180, 32, 140, 30, 28, 0, 30, 0.25F, false, 9, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.MIMIKKU, EnumDqmMonsterAIrate.MIMIKKU),
	GORUDENTOTEMU(102, "DqmEntityGorudentotemu", "Gorudentotemu", "HELL", 150, 38, 90, 0, 25, 15, 30, 0.325F, false, 10, 500, 1, 1, 0, "METARU", "Momoirosansimai", 1, 1, "Momoirosansimai", EnumDqmMonsterAI.GORUDENTOTEMU, EnumDqmMonsterAIrate.GORUDENTOTEMU),
	SIRYOUNOKISI(103, "DqmEntitySiryounokisi", "Siryounokisi", "HELL", 140, 20, 110, 24, 26, 0, 30, 0.25F, true, 14, 500, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.SIRYOUNOKISI, EnumDqmMonsterAIrate.SIRYOUNOKISI),
	AROINPU(104, "DqmEntityAroinpu", "Aroinpu", "HELL", 160, 23, 120, 0, 25, 0, 30, 0.175F, true, 4, 500, 1, 1, 1, "AKUMA", "Reddoatya", 1, 1, "Reddoatya", EnumDqmMonsterAI.AROINPU, EnumDqmMonsterAIrate.AROINPU),
	MAJIKARUHATTO(105, "DqmEntityMajikaruhatto", "Majikaruhatto", "HELL", 160, 23, 120, 40, 23, 0, 30, 0.225F, true, 12, 500, 1, 2, 0, "BEAST", "Arukemisuton", 1, 1, "Arukemisuton", EnumDqmMonsterAI.MAJIKARUHATTO, EnumDqmMonsterAIrate.MAJIKARUHATTO),
	METARUHANTA(106, "DqmEntityMetaruhanta", "Metaruhanta", "HELL", 165, 24, 120, 0, 25, 0, 30, 0.275F, true, 12, 300, 1, 1, 1, "BUSSITU", "Taipug", 1, 1, "Taipug", EnumDqmMonsterAI.METARUHANTA, EnumDqmMonsterAIrate.METARUHANTA),
	UMIBOUZU(107, "DqmEntityUmibouzu", "Umibouzu", "HELL", 150, 21, 120, 0, 22, 0, 30, 0.225F, true, 12, 500, 1, 1, 0, "SIZEN", "Tyokonuba", 1, 1, "Tyokonuba", EnumDqmMonsterAI.UMIBOUZU, EnumDqmMonsterAIrate.UMIBOUZU),
	DEDDOPEKKA(108, "DqmEntityDeddopekka", "Deddopekka", "HELL", 170, 24, 125, 20, 28, 0, 30, 0.225F, true, 4, 500, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.DEDDOPEKKA, EnumDqmMonsterAIrate.DEDDOPEKKA),
	BEHOMASURAIMU(109, "DqmEntityBehomasuraimu", "Behomasuraimu", "HELL", 170, 24, 130, 9999, 28, 0, 30, 0.25F, true, 10, 500, 1, 1, 0, "SURAIMU", "Metaruhoimin", 1, 1, "Metaruhoimin", EnumDqmMonsterAI.BEHOMASURAIMU, EnumDqmMonsterAIrate.BEHOMASURAIMU),
	BIGGUFEISU(110, "DqmEntityBiggufeisu", "Biggufeisu", "HELL", 175, 25, 130, 0, 27, 8, 30, 0.2F, true, 4, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.BIGGUFEISU, EnumDqmMonsterAIrate.BIGGUFEISU),
	GOREMU(111, "DqmEntityGoremu", "Goremu", "HELL", 195, 28, 130, 0, 33, 0, 30, 0.2F, true, 13, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.GOREMU, EnumDqmMonsterAIrate.GOREMU),
	HOTATEWARABI(112, "DqmEntityHotatewarabi", "Hotatewarabi", "HELL", 180, 26, 130, 20, 30, 0, 30, 0.225F, true, 15, 500, 1, 1, 0, "BEAST", "Seigin", 1, 1, "Seigin", EnumDqmMonsterAI.HOTATEWARABI, EnumDqmMonsterAIrate.HOTATEWARABI),
	JIGOKUNOHASAMI(113, "DqmEntityJigokunohasami", "Jigokunohasami", "HELL", 170, 24, 130, 30, 25, 7, 30, 0.2F, true, 12, 500, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.JIGOKUNOHASAMI, EnumDqmMonsterAIrate.JIGOKUNOHASAMI),
	MAPORENA(114, "DqmEntityMaporena", "Maporena", "HELL", 180, 26, 130, 0, 32, 0, 30, 0.3F, true, 2, 500, 1, 1, 0, "AKUMA", "Kuinmomon", 1, 1, "Kuinmomon", EnumDqmMonsterAI.MAPORENA, EnumDqmMonsterAIrate.MAPORENA),
	DARKSLIME(115, "DqmEntityDarkslime", "Darkslime", "HELL", 200, 29, 140, 0, 33, 0, 30, 0.225F, true, 15, 500, 0, 4, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.DARKSLIME, EnumDqmMonsterAIrate.DARKSLIME),
	DQMDRAGON(116, "DqmEntityDqmdragon", "Dqmdragon", "HELL", 210, 30, 140, 0, 35, 0, 30, 0.225F, true, 15, 500, 0, 4, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.DQMDRAGON, EnumDqmMonsterAIrate.DQMDRAGON),
	GAMEGON(117, "DqmEntityGamegon", "Gamegon", "HELL", 220, 31, 150, 0, 35, 5, 30, 0.175F, true, 4, 500, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.GAMEGON, EnumDqmMonsterAIrate.GAMEGON),
	MAGEMOMONJA(118, "DqmEntityMagemomonja", "Magemomonja", "HELL", 235, 34, 150, 32, 37, 0, 30, 0.225F, true, 15, 500, 0, 4, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.MAGEMOMONJA, EnumDqmMonsterAIrate.MAGEMOMONJA),
	PIKUSI(119, "DqmEntityPikusi", "Pikusi", "HELL", 215, 31, 150, 20, 33, 0, 30, 0.25F, true, 15, 500, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.PIKUSI, EnumDqmMonsterAIrate.PIKUSI),
	SURAIMUHAITAWA(120, "DqmEntitySuraimuhaitawa", "Suraimuhaitawa", "HELL", 230, 33, 150, 0, 35, 0, 30, 0.25F, true, 15, 500, 1, 1, 0, "SURAIMU", "Momoirosansimai", 1, 1, "Momoirosansimai", EnumDqmMonsterAI.SURAIMUHAITAWA, EnumDqmMonsterAIrate.SURAIMUHAITAWA),
	BARIIDODOG(121, "DqmEntityBariidodog", "Bariidodog", "HELL", 245, 35, 155, 15, 38, 0, 30, 0.225F, true, 15, 500, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.BARIIDODOG, EnumDqmMonsterAIrate.BARIIDODOG),
	MAOUNOKAGE(122, "DqmEntityMaounokage", "Maounokage", "HELL", 250, 36, 160, 50, 40, 0, 30, 0.3F, true, 16, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.MAOUNOKAGE, EnumDqmMonsterAIrate.MAOUNOKAGE),
	MEGAZARUROKKU(123, "DqmEntityMegazarurokku", "Megazarurokku", "HELL", 255, 36, 160, 0, 40, 0, 30, 0.25F, true, 16, 500, 1, 1, 0, "BUSSITU", "Noroinoiwa", 1, 1, "Noroinoiwa", EnumDqmMonsterAI.MEGAZARUROKKU, EnumDqmMonsterAIrate.MEGAZARUROKKU),
	BURAKKUBEJITA(124, "DqmEntityBurakkubejita", "Burakkubejita", "HELL", 250, 36, 165, 30, 45, 0, 30, 0.225F, true, 10, 500, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.BURAKKUBEJITA, EnumDqmMonsterAIrate.BURAKKUBEJITA),
	DRAGONNAITO(125, "DqmEntityDragonnaito", "Dragonnaito", "HELL", 260, 37, 170, 0, 48, 0, 30, 0.25F, true, 10, 500, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.DRAGONNAITO, EnumDqmMonsterAIrate.DRAGONNAITO),
	BURADDOSODO(126, "DqmEntityBuraddosodo", "Buraddosodo", "HELL", 265, 38, 175, 15, 50, 0, 30, 0.225F, true, 10, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.BURADDOSODO, EnumDqmMonsterAIrate.BURADDOSODO),
	BARAKKU(127, "DqmEntityBarakku", "Barakku", "HELL", 260, 37, 180, 0, 43, 0, 30, 0.225F, true, 10, 500, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.BARAKKU, EnumDqmMonsterAIrate.BARAKKU),
	BOUREIKENSI(128, "DqmEntityBoureikensi", "Boureikensi", "HELL", 270, 39, 180, 0, 45, 0, 30, 0.275F, true, 15, 500, 1, 1, 0, "UNDEAD", "Goldmanto", 1, 1, "Goldmanto", EnumDqmMonsterAI.BOUREIKENSI, EnumDqmMonsterAIrate.BOUREIKENSI),
	GANIRASU(129, "DqmEntityGanirasu", "Ganirasu", "HELL", 265, 38, 180, 0, 45, 10, 30, 0.2F, true, 10, 500, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.GANIRASU, EnumDqmMonsterAIrate.GANIRASU),
	GOLDMAN(130, "DqmEntityGoldman", "Goldman", "HELL", 280, 150, 180, 0, 50, 0, 30, 0.25F, true, 25, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.GOLDMAN, EnumDqmMonsterAIrate.GOLDMAN),
	REDSAIKURON(131, "DqmEntityRedsaikuron", "Redsaikuron", "HELL", 260, 37, 180, 24, 40, 0, 30, 0.25F, true, 18, 500, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.REDSAIKURON, EnumDqmMonsterAIrate.REDSAIKURON),
	SURAIMUBEHOMAZUN(132, "DqmEntitySuraimubehomazun", "Suraimubehomazun", "HELL", 275, 39, 180, 9999, 45, 0, 30, 0.275F, true, 18, 500, 0, 2, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURAIMUBEHOMAZUN, EnumDqmMonsterAIrate.SURAIMUBEHOMAZUN),
	GAMEGONLOAD(133, "DqmEntityGamegonload", "Gamegonload", "HELL", 265, 38, 185, 50, 45, 7, 30, 0.21F, true, 15, 500, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.GAMEGONLOAD, EnumDqmMonsterAIrate.GAMEGONLOAD),
	PUYON(134, "DqmEntityPuyon", "Puyon", "HELL", 260, 37, 185, 0, 43, 0, 30, 0.35F, true, 18, 500, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.PUYON, EnumDqmMonsterAIrate.PUYON),
	BABURUKING(135, "DqmEntityBaburuking", "Baburuking", "HELL", 275, 39, 190, 0, 45, 0, 30, 0.225F, true, 10, 500, 0, 3, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.BABURUKING, EnumDqmMonsterAIrate.BABURUKING),
	DGIZUMO(136, "DqmEntityDgizumo", "Dgizumo", "HELL", 270, 39, 190, 0, 50, 0, 30, 0.225F, true, 10, 500, 0, 4, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.DGIZUMO, EnumDqmMonsterAIrate.DGIZUMO),
	DOLLMASTER(137, "DqmEntityDollmaster", "Dollmaster", "HELL", 280, 40, 190, 0, 50, 0, 30, 0.225F, true, 15, 500, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.DOLLMASTER, EnumDqmMonsterAIrate.DOLLMASTER),
	KIRAMASIN(138, "DqmEntityKiramasin", "Kiramasin", "HELL", 290, 41, 195, 0, 53, 0, 30, 0.25F, true, 22, 500, 1, 1, 1, "BUSSITU", "Taipug", 1, 1, "Taipug", EnumDqmMonsterAI.KIRAMASIN, EnumDqmMonsterAIrate.KIRAMASIN),
	KISUDRAGON(139, "DqmEntityKisudragon", "Kisudragon", "HELL", 300, 43, 200, 0, 55, 0, 30, 0.25F, true, 22, 500, 0, 4, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.KISUDRAGON, EnumDqmMonsterAIrate.KISUDRAGON),
	KUINSURAIMU(140, "DqmEntityKuinsuraimu", "Kuinsuraimu", "HELL", 300, 43, 200, 200, 47, 0, 30, 0.275F, true, 22, 500, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.KUINSURAIMU, EnumDqmMonsterAIrate.KUINSURAIMU),
	ANKOKUMAJIN(141, "DqmEntityAnkokumajin", "Ankokumajin", "HELL", 450, 64, 220, 0, 63, 0, 30, 0.225F, true, 10, 500, 0, 3, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.ANKOKUMAJIN, EnumDqmMonsterAIrate.ANKOKUMAJIN),
	KEMUNKURUSU(142, "DqmEntityKemunkurusu", "Kemunkurusu", "HELL", 320, 46, 220, 120, 55, 0, 30, 0.25F, true, 25, 500, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.KEMUNKURUSU, EnumDqmMonsterAIrate.KEMUNKURUSU),
	KIRAKURABU(143, "DqmEntityKirakurabu", "Kirakurabu", "HELL", 310, 44, 220, 80, 55, 12, 30, 0.225F, true, 25, 500, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.KIRAKURABU, EnumDqmMonsterAIrate.KIRAKURABU),
	MAGEMATANGO(144, "DqmEntityMagematango", "Magematango", "HELL", 300, 43, 220, 30, 53, 0, 30, 0.225F, true, 23, 500, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.MAGEMATANGO, EnumDqmMonsterAIrate.MAGEMATANGO),
	TUBOKKU(145, "DqmEntityTubokku", "Tubokku", "HELL", 350, 50, 220, 75, 55, 0, 30, 0.5F, true, 22, 500, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.TUBOKKU, EnumDqmMonsterAIrate.TUBOKKU),
	MAGUMARON(146, "DqmEntityMagumaron", "Magumaron", "HELL", 480, 69, 230, 75, 50, 0, 30, 0.2F, true, 23, 500, 1, 3, 0, "SIZEN", "Tyokonuba", 1, 1, "Tyokonuba", EnumDqmMonsterAI.MAGUMARON, EnumDqmMonsterAIrate.MAGUMARON),
	POMBOM(147, "DqmEntityPombom", "Pombom", "HELL", 500, 71, 230, 45, 55, 0, 30, 0.25F, true, 23, 500, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.POMBOM, EnumDqmMonsterAIrate.POMBOM),
	STARKIMERA(148, "DqmEntityStarkimera", "Starkimera", "HELL", 540, 77, 250, 0, 58, 0, 30, 0.25F, false, 25, 500, 1, 4, 0, "SIZEN", "Moonkimera", 1, 1, "Moonkimera", EnumDqmMonsterAI.STARKIMERA, EnumDqmMonsterAIrate.STARKIMERA),
	SODOFANTOMU(149, "DqmEntitySodofantomu", "Sodofantomu", "HELL", 600, 86, 280, 0, 60, 0, 30, 0.35F, true, 28, 500, 1, 1, 0, "UNDEAD", "Goldmanto", 1, 1, "Goldmanto", EnumDqmMonsterAI.SODOFANTOMU, EnumDqmMonsterAIrate.SODOFANTOMU),
	DRAGONRAIDA(150, "DqmEntityDragonraida", "Dragonraida", "HELL", 650, 93, 295, 0, 60, 0, 30, 0.26F, true, 23, 500, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.DRAGONRAIDA, EnumDqmMonsterAIrate.DRAGONRAIDA),
	SIRUBADEBIRU(151, "DqmEntitySirubadebiru", "Sirubadebiru", "HELL", 750, 107, 300, 60, 60, 0, 30, 0.35F, true, 20, 500, 1, 1, 0, "AKUMA", "Debirurodo", 1, 1, "Debirurodo", EnumDqmMonsterAI.SIRUBADEBIRU, EnumDqmMonsterAIrate.SIRUBADEBIRU),
	SURAIMUMADYURA(152, "DqmEntitySuraimumadyura", "Suraimumadyura", "HELL", 800, 114, 300, 0, 60, 15, 30, 0.3F, true, 35, 500, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURAIMUMADYURA, EnumDqmMonsterAIrate.SURAIMUMADYURA),
	SAIKUROPUSU(153, "DqmEntitySaikuropusu", "Saikuropusu", "HELL", 950, 136, 350, 0, 68, 0, 30, 0.275F, true, 28, 500, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.SAIKUROPUSU, EnumDqmMonsterAIrate.SAIKUROPUSU),
	STONMAN(154, "DqmEntityStonman", "Stonman", "HELL", 850, 121, 350, 0, 75, 0, 30, 0.275F, true, 20, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.STONMAN, EnumDqmMonsterAIrate.STONMAN),
	BIGHANMA(155, "DqmEntityBighanma", "Bighanma", "HELL", 290, 40, 210, 0, 60, 0, 30, 0.2F, true, 20, 500, 1, 1, 0, "AKUMA", "Togekonbou", 1, 1, "Togekonbou", EnumDqmMonsterAI.BIGHANMA, EnumDqmMonsterAIrate.BIGHANMA),
	BOSUTORORU(156, "DqmEntityBosutororu", "Bosutororu", "HELL", 700, 15, 390, 0, 85, 0, 30, 0.1F, true, 20, 500, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.BOSUTORORU, EnumDqmMonsterAIrate.BOSUTORORU),
	DORAGONSORUJA(157, "DqmEntityDoragonsoruja", "Doragonsoruja", "HELL", 310, 45, 210, 0, 65, 0, 30, 0.2F, true, 20, 500, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.DORAGONSORUJA, EnumDqmMonsterAIrate.DORAGONSORUJA),
	FUREIMU(158, "DqmEntityFureimu", "Fureimu", "HELL", 190, 25, 135, 0, 40, 0, 30, 0.2F, true, 20, 500, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.FUREIMU, EnumDqmMonsterAIrate.FUREIMU),
	KEDAMON(159, "DqmEntityKedamon", "Kedamon", "HELL", 230, 35, 140, 0, 30, 0, 30, 0.225F, true, 20, 500, 1, 1, 0, "BEAST", "Pinkbonbon", 1, 1, "Pinkbonbon", EnumDqmMonsterAI.KEDAMON, EnumDqmMonsterAIrate.KEDAMON),
	KIMENDOUSI(160, "DqmEntityKimendousi", "Kimendousi", "HELL", 280, 45, 200, 22, 35, 0, 30, 0.175F, true, 20, 500, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.KIMENDOUSI, EnumDqmMonsterAIrate.KIMENDOUSI),
	KIRAAMA(161, "DqmEntityKiraama", "Kiraama", "HELL", 320, 60, 310, 15, 60, 0, 30, 0.275F, true, 20, 500, 1, 1, 0, "BUSSITU", "Shuvaluts", 1, 1, "Shuvaluts", EnumDqmMonsterAI.KIRAAMA, EnumDqmMonsterAIrate.KIRAAMA),
	KIRAMASIN2(162, "DqmEntityKiramasin2", "Kiramasin2", "HELL", 800, 80, 350, 0, 72, 0, 30, 0.325F, true, 20, 500, 1, 1, 0, "BUSSITU", "Taipug", 1, 1, "Taipug", EnumDqmMonsterAI.KIRAMASIN2, EnumDqmMonsterAIrate.KIRAMASIN2),
	PAPETTOMAN(163, "DqmEntityPapettoman", "Papettoman", "HELL", 310, 50, 260, 0, 50, 0, 30, 0.225F, true, 20, 500, 1, 1, 0, "BUSSITU", "Madrainbow", 1, 1, "Madrainbow", EnumDqmMonsterAI.PAPETTOMAN, EnumDqmMonsterAIrate.PAPETTOMAN),
	SIRYOU(164, "DqmEntitySiryou", "Siryou", "HELL", 450, 60, 280, 0, 62, 0, 30, 0.225F, true, 20, 500, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.SIRYOU, EnumDqmMonsterAIrate.SIRYOU),
	TORORUKING(165, "DqmEntityTororuking", "Tororuking", "HELL", 710, 10, 450, 0, 75, 0, 30, 0.1F, true, 20, 500, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.TORORUKING, EnumDqmMonsterAIrate.TORORUKING),
	METASURA(166, "DqmEntityMetasura", "Metasura", "METARU", 1050, 11, 4, 999, 5, 24, 500, 0.75F, true, 20, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.METASURA, EnumDqmMonsterAIrate.METASURA),
	METARUBURAZAZU(167, "DqmEntityMetaruburazazu", "Metaruburazazu", "METARU", 3300, 33, 8, 999, 10, 24, 500, 0.75F, true, 20, 1000, 1, 4, 0, "METARU", "Momoirosansimai", 1, 1, "Momoirosansimai", EnumDqmMonsterAI.METARUBURAZAZU, EnumDqmMonsterAIrate.METARUBURAZAZU),
	HAGUMETA(168, "DqmEntityHagumeta", "Hagumeta", "METARU", 10500, 105, 13, 999, 10, 24, 500, 0.75F, true, 20, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.HAGUMETA, EnumDqmMonsterAIrate.HAGUMETA),
	DRAGOMETARU(169, "DqmEntityDragometaru", "Dragometaru", "METARU", 21000, 210, 25, 999, 15, 24, 500, 0.75F, true, 20, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.DRAGOMETARU, EnumDqmMonsterAIrate.DRAGOMETARU),
	METAKING(170, "DqmEntityMetaking", "Metaking", "METARU", 30000, 300, 30, 999, 25, 24, 500, 0.75F, true, 20, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.METAKING, EnumDqmMonsterAIrate.METAKING),
	DAIYAMONDOSURAIMU(171, "DqmEntityDaiyamondosuraimu", "Daiyamondosuraimu", "METARU", 45000, 450, 35, 999, 20, 24, 500, 0.75F, true, 20, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.DAIYAMONDOSURAIMU, EnumDqmMonsterAIrate.DAIYAMONDOSURAIMU),
	PURATINAKING(172, "DqmEntityPuratinaking", "Puratinaking", "METARU", 60000, 600, 50, 999, 20, 24, 500, 0.75F, true, 20, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.PURATINAKING, EnumDqmMonsterAIrate.PURATINAKING),
	HAGUREMETARUKING(173, "DqmEntityHaguremetaruking", "Haguremetaruking", "METARU", 100000, 1000, 100, 0, 30, 24, 500, 0.75F, true, 40, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.HAGUREMETARUKING, EnumDqmMonsterAIrate.HAGUREMETARUKING),
	GOLDENMETALSLIME(174, "DqmEntityGoldenmetalslime", "Goldenmetalslime", "METARU", 5000, 100000, 300, 0, 100, 24, 500, 1.5F, true, 40, 1000, 0, 4, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.GOLDENMETALSLIME, EnumDqmMonsterAIrate.GOLDENMETALSLIME),
	DORAKI(175, "DqmEntityDoraki", "Doraki", "NIGHT", 5, 1, 13, 0, 2, 0, 15, 0.175F, false, 2, 650, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.DORAKI, EnumDqmMonsterAIrate.DORAKI),
	GHOST(176, "DqmEntityGhost", "Ghost", "NIGHT", 8, 1, 16, 0, 3, 0, 15, 0.175F, false, 2, 650, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.GHOST, EnumDqmMonsterAIrate.GHOST),
	MERAGOSUTO(177, "DqmEntityMeragosuto", "Meragosuto", "NIGHT", 11, 2, 18, 45, 4, 0, 15, 0.15F, true, 2, 650, 0, 4, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.MERAGOSUTO, EnumDqmMonsterAIrate.MERAGOSUTO),
	OBAKEKYANDORU(178, "DqmEntityObakekyandoru", "Obakekyandoru", "NIGHT", 13, 2, 18, 35, 5, 0, 15, 0.175F, false, 2, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.OBAKEKYANDORU, EnumDqmMonsterAIrate.OBAKEKYANDORU),
	DORAKIMA(179, "DqmEntityDorakima", "Dorakima", "NIGHT", 14, 2, 35, 0, 6, 0, 15, 0.2F, false, 2, 650, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.DORAKIMA, EnumDqmMonsterAIrate.DORAKIMA),
	SYADO(180, "DqmEntitySyado", "Syado", "NIGHT", 16, 2, 35, 30, 7, 0, 15, 0.2F, false, 2, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.SYADO, EnumDqmMonsterAIrate.SYADO),
	TUTIWARASI(181, "DqmEntityTutiwarasi", "Tutiwarasi", "NIGHT", 15, 2, 35, 0, 6, 0, 15, 0.175F, false, 2, 8, 2, 1, 0, "UNDEAD", "Tutiwarasi", 1, 4, "Tutiwarasi", EnumDqmMonsterAI.TUTIWARASI, EnumDqmMonsterAIrate.TUTIWARASI),
	HITOKUIGA(182, "DqmEntityHitokuiga", "Hitokuiga", "NIGHT", 21, 3, 42, 0, 7, 0, 15, 0.175F, false, 2, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.HITOKUIGA, EnumDqmMonsterAIrate.HITOKUIGA),
	METOROGHOST(183, "DqmEntityMetoroghost", "Metoroghost", "NIGHT", 23, 3, 42, 0, 8, 0, 15, 0.2F, false, 2, 650, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.METOROGHOST, EnumDqmMonsterAIrate.METOROGHOST),
	ARUMIRAJI(184, "DqmEntityArumiraji", "Arumiraji", "NIGHT", 29, 4, 45, 15, 11, 0, 15, 0.225F, false, 4, 650, 1, 1, 0, "BEAST", "Gorudenkon", 1, 1, "Gorudenkon", EnumDqmMonsterAI.ARUMIRAJI, EnumDqmMonsterAIrate.ARUMIRAJI),
	HGIZUMO(185, "DqmEntityHgizumo", "Hgizumo", "NIGHT", 26, 4, 45, 20, 9, 0, 15, 0.175F, true, 2, 650, 0, 4, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.HGIZUMO, EnumDqmMonsterAIrate.HGIZUMO),
	TAHODORAKI(186, "DqmEntityTahodoraki", "Tahodoraki", "NIGHT", 25, 4, 45, 30, 8, 0, 15, 0.225F, false, 4, 650, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.TAHODORAKI, EnumDqmMonsterAIrate.TAHODORAKI),
	ANIMARUZONBI(187, "DqmEntityAnimaruzonbi", "Animaruzonbi", "NIGHT", 30, 4, 48, 30, 12, 0, 15, 0.225F, false, 4, 650, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.ANIMARUZONBI, EnumDqmMonsterAIrate.ANIMARUZONBI),
	HOROGHOST(188, "DqmEntityHoroghost", "Horoghost", "NIGHT", 30, 4, 55, 12, 9, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.HOROGHOST, EnumDqmMonsterAIrate.HOROGHOST),
	KIRASUKO(189, "DqmEntityKirasuko", "Kirasuko", "NIGHT", 30, 4, 55, 0, 9, 0, 15, 0.2F, false, 7, 650, 1, 1, 0, "BEAST", "Kirapike", 1, 1, "Kirapike", EnumDqmMonsterAI.KIRASUKO, EnumDqmMonsterAIrate.KIRASUKO),
	PINKMOMON(190, "DqmEntityPinkmomon", "Pinkmomon", "NIGHT", 30, 4, 55, 0, 9, 0, 15, 0.2F, false, 4, 650, 1, 1, 0, "AKUMA", "Kuinmomon", 1, 1, "Kuinmomon", EnumDqmMonsterAI.PINKMOMON, EnumDqmMonsterAIrate.PINKMOMON),
	UMIUSI(191, "DqmEntityUmiusi", "Umiusi", "NIGHT", 32, 5, 55, 0, 9, 0, 15, 0.2F, false, 2, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.UMIUSI, EnumDqmMonsterAIrate.UMIUSI),
	SIBIREAGEHA(192, "DqmEntitySibireageha", "Sibireageha", "NIGHT", 33, 5, 58, 0, 10, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.SIBIREAGEHA, EnumDqmMonsterAIrate.SIBIREAGEHA),
	BEROBERO(193, "DqmEntityBerobero", "Berobero", "NIGHT", 34, 5, 60, 15, 10, 0, 15, 0.2F, false, 4, 8, 2, 1, 0, "UNDEAD", "Berobero", 1, 4, "Berobero", EnumDqmMonsterAI.BEROBERO, EnumDqmMonsterAIrate.BEROBERO),
	FGIZUMO(194, "DqmEntityFgizumo", "Fgizumo", "NIGHT", 26, 4, 60, 20, 10, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.FGIZUMO, EnumDqmMonsterAIrate.FGIZUMO),
	HERUGHOST(195, "DqmEntityHerughost", "Herughost", "NIGHT", 33, 5, 60, 25, 10, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.HERUGHOST, EnumDqmMonsterAIrate.HERUGHOST),
	SURAIMUBOGU(196, "DqmEntitySuraimubogu", "Suraimubogu", "NIGHT", 34, 5, 60, 0, 10, 0, 15, 0.225F, false, 8, 650, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURAIMUBOGU, EnumDqmMonsterAIrate.SURAIMUBOGU),
	TOMOSIBIKOZOU(197, "DqmEntityTomosibikozou", "Tomosibikozou", "NIGHT", 35, 5, 62, 15, 11, 0, 15, 0.2F, true, 4, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.TOMOSIBIKOZOU, EnumDqmMonsterAIrate.TOMOSIBIKOZOU),
	BEBISATAN(198, "DqmEntityBebisatan", "Bebisatan", "NIGHT", 35, 5, 65, 0, 10, 0, 15, 0.2F, false, 4, 650, 1, 4, 0, "AKUMA", "Bebingosatan", 1, 1, "Bebingosatan", EnumDqmMonsterAI.BEBISATAN, EnumDqmMonsterAIrate.BEBISATAN),
	BEHOIMISURAIMU(199, "DqmEntityBehoimisuraimu", "Behoimisuraimu", "NIGHT", 36, 5, 65, 999, 10, 0, 15, 0.2F, false, 4, 650, 1, 2, 0, "SURAIMU", "Metaruhoimin", 1, 1, "Metaruhoimin", EnumDqmMonsterAI.BEHOIMISURAIMU, EnumDqmMonsterAIrate.BEHOIMISURAIMU),
	BUCHUNPA(200, "DqmEntityBuchunpa", "Buchunpa", "NIGHT", 38, 5, 65, 0, 11, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.BUCHUNPA, EnumDqmMonsterAIrate.BUCHUNPA),
	HYOUGANMAJIN(201, "DqmEntityHyouganmajin", "Hyouganmajin", "NIGHT", 43, 6, 65, 0, 14, 0, 15, 0.225F, false, 4, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.HYOUGANMAJIN, EnumDqmMonsterAIrate.HYOUGANMAJIN),
	MARINSURAIMU(202, "DqmEntityMarinsuraimu", "Marinsuraimu", "NIGHT", 37, 5, 65, 15, 10, 0, 15, 0.2F, false, 4, 650, 1, 1, 0, "SURAIMU", "Metaruhoimin", 1, 1, "Metaruhoimin", EnumDqmMonsterAI.MARINSURAIMU, EnumDqmMonsterAIrate.MARINSURAIMU),
	MATANGO(203, "DqmEntityMatango", "Matango", "NIGHT", 35, 5, 65, 0, 10, 0, 15, 0.2F, false, 6, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.MATANGO, EnumDqmMonsterAIrate.MATANGO),
	ODORUHOUSEKI(204, "DqmEntityOdoruhouseki", "Odoruhouseki", "NIGHT", 35, 42, 65, 9999, 10, 0, 15, 0.275F, false, 4, 650, 1, 1, 0, "BUSSITU", "Sweetbag", 1, 1, "Sweetbag", EnumDqmMonsterAI.ODORUHOUSEKI, EnumDqmMonsterAIrate.ODORUHOUSEKI),
	SIBIREDANBIRA(205, "DqmEntitySibiredanbira", "Sibiredanbira", "NIGHT", 43, 6, 65, 0, 13, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.SIBIREDANBIRA, EnumDqmMonsterAIrate.SIBIREDANBIRA),
	TONBURERO(206, "DqmEntityTonburero", "Tonburero", "NIGHT", 42, 6, 65, 0, 12, 0, 15, 0.2F, false, 4, 650, 1, 1, 0, "BEAST", "Arukemisuton", 1, 1, "Arukemisuton", EnumDqmMonsterAI.TONBURERO, EnumDqmMonsterAIrate.TONBURERO),
	BAKUDANBEBI(207, "DqmEntityBakudanbebi", "Bakudanbebi", "NIGHT", 42, 6, 70, 0, 10, 0, 15, 0.225F, false, 15, 650, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.BAKUDANBEBI, EnumDqmMonsterAIrate.BAKUDANBEBI),
	DESUFURATTA(208, "DqmEntityDesufuratta", "Desufuratta", "NIGHT", 43, 6, 70, 0, 15, 0, 15, 0.225F, false, 4, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.DESUFURATTA, EnumDqmMonsterAIrate.DESUFURATTA),
	JERIMAN(209, "DqmEntityJeriman", "Jeriman", "NIGHT", 43, 6, 70, 0, 15, 0, 15, 0.15F, false, 4, 650, 1, 1, 0, "SIZEN", "Tyokonuba", 1, 1, "Tyokonuba", EnumDqmMonsterAI.JERIMAN, EnumDqmMonsterAIrate.JERIMAN),
	AKUMANOSYO(210, "DqmEntityAkumanosyo", "Akumanosyo", "NIGHT", 45, 6, 75, 35, 12, 0, 15, 0.2F, false, 4, 650, 0, 4, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.AKUMANOSYO, EnumDqmMonsterAIrate.AKUMANOSYO),
	BAKUDANIWA(211, "DqmEntityBakudaniwa", "Bakudaniwa", "NIGHT", 48, 7, 75, 0, 16, 0, 15, 0.175F, false, 2, 650, 1, 1, 0, "BUSSITU", "Noroinoiwa", 1, 1, "Noroinoiwa", EnumDqmMonsterAI.BAKUDANIWA, EnumDqmMonsterAIrate.BAKUDANIWA),
	DOKUYAZUKIN(212, "DqmEntityDokuyazukin", "Dokuyazukin", "NIGHT", 45, 6, 75, 0, 14, 0, 15, 0.15F, false, 4, 650, 1, 1, 1, "AKUMA", "Reddoatya", 1, 1, "Reddoatya", EnumDqmMonsterAI.DOKUYAZUKIN, EnumDqmMonsterAIrate.DOKUYAZUKIN),
	SAMAYOUTAMASII(213, "DqmEntitySamayoutamasii", "Samayoutamasii", "NIGHT", 45, 6, 75, 0, 16, 0, 15, 0.225F, true, 8, 650, 0, 4, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.SAMAYOUTAMASII, EnumDqmMonsterAIrate.SAMAYOUTAMASII),
	SURAIMUBURESU(214, "DqmEntitySuraimuburesu", "Suraimuburesu", "NIGHT", 45, 6, 75, 0, 15, 0, 15, 0.225F, false, 8, 650, 0, 4, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURAIMUBURESU, EnumDqmMonsterAIrate.SURAIMUBURESU),
	BABURIN(215, "DqmEntityBaburin", "Baburin", "NIGHT", 50, 7, 78, 0, 21, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.BABURIN, EnumDqmMonsterAIrate.BABURIN),
	AKUMANOTUBO(216, "DqmEntityAkumanotubo", "Akumanotubo", "NIGHT", 60, 9, 80, 50, 20, 0, 15, 0.5F, false, 4, 650, 0, 3, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.AKUMANOTUBO, EnumDqmMonsterAIrate.AKUMANOTUBO),
	BEHOIMUSURAIMU(217, "DqmEntityBehoimusuraimu", "Behoimusuraimu", "NIGHT", 52, 7, 80, 9999, 16, 0, 15, 0.225F, false, 4, 650, 1, 2, 0, "SURAIMU", "Metaruhoimin", 1, 1, "Metaruhoimin", EnumDqmMonsterAI.BEHOIMUSURAIMU, EnumDqmMonsterAIrate.BEHOIMUSURAIMU),
	ENZERUSLIME(218, "DqmEntityEnzeruslime", "Enzeruslime", "NIGHT", 60, 9, 80, 45, 17, 0, 15, 0.2F, false, 15, 650, 0, 2, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.ENZERUSLIME, EnumDqmMonsterAIrate.ENZERUSLIME),
	GAIKOTUKENSI(219, "DqmEntityGaikotukensi", "Gaikotukensi", "NIGHT", 55, 8, 80, 0, 19, 0, 15, 0.2F, false, 8, 650, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.GAIKOTUKENSI, EnumDqmMonsterAIrate.GAIKOTUKENSI),
	SUMORUGURU(220, "DqmEntitySumoruguru", "Sumoruguru", "NIGHT", 53, 8, 80, 0, 18, 0, 15, 0.225F, false, 10, 8, 2, 1, 0, "UNDEAD", "Sumoruguru", 1, 4, "Sumoruguru", EnumDqmMonsterAI.SUMORUGURU, EnumDqmMonsterAIrate.SUMORUGURU),
	SUPEKUTETTO(221, "DqmEntitySupekutetto", "Supekutetto", "NIGHT", 55, 8, 80, 32, 18, 0, 15, 0.2F, false, 8, 650, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.SUPEKUTETTO, EnumDqmMonsterAIrate.SUPEKUTETTO),
	SURA2(222, "DqmEntitySura2", "Sura2", "NIGHT", 50, 7, 80, 0, 15, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURA2, EnumDqmMonsterAIrate.SURA2),
	BERONYAAGO(223, "DqmEntityBeronyaago", "Beronyaago", "NIGHT", 75, 11, 85, 50, 23, 0, 15, 0.2F, false, 4, 650, 1, 1, 0, "BEAST", "Maaburun", 1, 1, "Maaburun", EnumDqmMonsterAI.BERONYAAGO, EnumDqmMonsterAIrate.BERONYAAGO),
	BUTTIZUKINYA(224, "DqmEntityButtizukinya", "Buttizukinya", "NIGHT", 63, 9, 85, 0, 20, 0, 15, 0.2F, false, 4, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.BUTTIZUKINYA, EnumDqmMonsterAIrate.BUTTIZUKINYA),
	MEIJIKIMERA(225, "DqmEntityMeijikimera", "Meijikimera", "NIGHT", 70, 10, 85, 99, 23, 0, 15, 0.225F, false, 8, 650, 1, 4, 0, "SIZEN", "Moonkimera", 1, 1, "Moonkimera", EnumDqmMonsterAI.MEIJIKIMERA, EnumDqmMonsterAIrate.MEIJIKIMERA),
	METARURAIDA(226, "DqmEntityMetaruraida", "Metaruraida", "NIGHT", 70, 10, 85, 15, 22, 5, 15, 0.3F, true, 8, 650, 1, 1, 0, "SURAIMU", "Momoirosansimai", 1, 1, "Momoirosansimai", EnumDqmMonsterAI.METARURAIDA, EnumDqmMonsterAIrate.METARURAIDA),
	NIGHTWALKER(227, "DqmEntityNightwalker", "Nightwalker", "NIGHT", 65, 9, 85, 30, 20, 0, 15, 0.225F, false, 8, 650, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.NIGHTWALKER, EnumDqmMonsterAIrate.NIGHTWALKER),
	YOUGANMAJIN(228, "DqmEntityYouganmajin", "Youganmajin", "NIGHT", 80, 11, 85, 0, 24, 0, 15, 0.225F, true, 4, 650, 0, 3, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.YOUGANMAJIN, EnumDqmMonsterAIrate.YOUGANMAJIN),
	MRIPPUSU(229, "DqmEntityMrippusu", "Mrippusu", "NIGHT", 85, 12, 90, 0, 24, 0, 15, 0.2F, false, 8, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.MRIPPUSU, EnumDqmMonsterAIrate.MRIPPUSU),
	BURADDIHANDO(230, "DqmEntityBuraddihando", "Buraddihando", "NIGHT", 110, 16, 95, 0, 26, 0, 15, 0.2F, false, 4, 4, 1, 1, 0, "BUSSITU", "Buraddihando", 2, 3, "Buraddihando", EnumDqmMonsterAI.BURADDIHANDO, EnumDqmMonsterAIrate.BURADDIHANDO),
	SKULLGAROO(231, "DqmEntitySkullgaroo", "Skullgaroo", "NIGHT", 100, 14, 95, 0, 25, 0, 15, 0.25F, false, 9, 650, 1, 1, 0, "BEAST", "Seigin", 1, 1, "Seigin", EnumDqmMonsterAI.SKULLGAROO, EnumDqmMonsterAIrate.SKULLGAROO),
	MEIJIDORAKI(232, "DqmEntityMeijidoraki", "Meijidoraki", "NIGHT", 115, 16, 100, 20, 19, 0, 15, 0.225F, false, 4, 650, 0, 4, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.MEIJIDORAKI, EnumDqmMonsterAIrate.MEIJIDORAKI),
	SUMAIRUROKKU(233, "DqmEntitySumairurokku", "Sumairurokku", "NIGHT", 120, 17, 100, 0, 20, 0, 15, 0.1F, false, 18, 650, 1, 1, 0, "BUSSITU", "Noroinoiwa", 1, 1, "Noroinoiwa", EnumDqmMonsterAI.SUMAIRUROKKU, EnumDqmMonsterAIrate.SUMAIRUROKKU),
	MAPETMAN(234, "DqmEntityMapetman", "Mapetman", "NIGHT", 130, 19, 105, 20, 20, 0, 15, 0.225F, false, 4, 650, 0, 1, 0, "TOKUSYU", null, 1, 1, null, EnumDqmMonsterAI.MAPETMAN, EnumDqmMonsterAIrate.MAPETMAN),
	KINGSURA(235, "DqmEntityKingsura", "Kingsura", "NIGHT", 110, 16, 110, 0, 22, 0, 15, 0.225F, false, 4, 5, 2, 1, 0, "SURAIMU", "Sura2", 5, 7, "Sura2", EnumDqmMonsterAI.KINGSURA, EnumDqmMonsterAIrate.KINGSURA),
	MINIDEMON(236, "DqmEntityMinidemon", "Minidemon", "NIGHT", 130, 19, 110, 30, 22, 0, 15, 0.225F, true, 11, 650, 1, 3, 0, "AKUMA", "Bebingosatan", 1, 1, "Bebingosatan", EnumDqmMonsterAI.MINIDEMON, EnumDqmMonsterAIrate.MINIDEMON),
	METARUHANTAKEN(237, "DqmEntityMetaruhantaken", "Metaruhantaken", "NIGHT", 165, 24, 120, 0, 25, 0, 15, 0.225F, true, 12, 650, 1, 1, 0, "BUSSITU", "Taipug", 1, 1, "Taipug", EnumDqmMonsterAI.METARUHANTAKEN, EnumDqmMonsterAIrate.METARUHANTAKEN),
	KIRAPAN2(238, "DqmEntityKirapan2", "Kirapan2", "NIGHT", 190, 27, 135, 0, 30, 0, 15, 0.35F, false, 15, 650, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.KIRAPAN2, EnumDqmMonsterAIrate.KIRAPAN2),
	AXEDORAGON(239, "DqmEntityAxedoragon", "Axedoragon", "NIGHT", 150, 25, 140, 0, 28, 0, 15, 0.175F, false, 15, 650, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.AXEDORAGON, EnumDqmMonsterAIrate.AXEDORAGON),
	BESUKING(240, "DqmEntityBesuking", "Besuking", "NIGHT", 110, 17, 100, 0, 25, 0, 15, 0.225F, false, 15, 650, 2, 1, 0, "SURAIMU", "Suraimubesu", 1, 1, "Suraimubesu", EnumDqmMonsterAI.BESUKING, EnumDqmMonsterAIrate.BESUKING),
	DANSUNIDORU(241, "DqmEntityDansunidoru", "Dansunidoru", "NIGHT", 80, 12, 82, 0, 23, 0, 15, 0.2F, false, 15, 650, 1, 1, 0, "SIZEN", "Sabotengold", 1, 1, "Sabotengold", EnumDqmMonsterAI.DANSUNIDORU, EnumDqmMonsterAIrate.DANSUNIDORU),
	DORONINGYOU(242, "DqmEntityDoroningyou", "Doroningyou", "NIGHT", 90, 15, 78, 0, 15, 0, 15, 0.25F, false, 15, 650, 1, 1, 0, "BUSSITU", "Madrainbow", 1, 1, "Madrainbow", EnumDqmMonsterAI.DORONINGYOU, EnumDqmMonsterAIrate.DORONINGYOU),
	GAPPURIN(243, "DqmEntityGappurin", "Gappurin", "NIGHT", 85, 13, 68, 15, 18, 0, 15, 0.2F, false, 15, 650, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.GAPPURIN, EnumDqmMonsterAIrate.GAPPURIN),
	GENJUTUSI(244, "DqmEntityGenjutusi", "Genjutusi", "NIGHT", 100, 17, 74, 25, 20, 0, 15, 0.175F, false, 15, 650, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.GENJUTUSI, EnumDqmMonsterAIrate.GENJUTUSI),
	MOKOMOKOJUU(245, "DqmEntityMokomokojuu", "Mokomokojuu", "NIGHT", 65, 10, 84, 0, 14, 0, 15, 0.2F, false, 15, 650, 1, 1, 0, "BEAST", "Pinkbonbon", 1, 1, "Pinkbonbon", EnumDqmMonsterAI.MOKOMOKOJUU, EnumDqmMonsterAIrate.MOKOMOKOJUU),
	RAIMUSURAIMU(246, "DqmEntityRaimusuraimu", "Raimusuraimu", "NIGHT", 25, 5, 45, 0, 10, 0, 15, 0.175F, false, 15, 650, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.RAIMUSURAIMU, EnumDqmMonsterAIrate.RAIMUSURAIMU),
	SAMAYOUYOROI(247, "DqmEntitySamayouyoroi", "Samayouyoroi", "NIGHT", 100, 18, 101, 0, 28, 0, 15, 0.225F, false, 15, 650, 1, 1, 0, "BUSSITU", "Shuvaluts", 1, 1, "Shuvaluts", EnumDqmMonsterAI.SAMAYOUYOROI, EnumDqmMonsterAIrate.SAMAYOUYOROI),
	TORORU(248, "DqmEntityTororu", "Tororu", "NIGHT", 210, 5, 150, 0, 35, 0, 15, 0.125F, false, 15, 650, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.TORORU, EnumDqmMonsterAIrate.TORORU),
	WANPAKUSATAN(249, "DqmEntityWanpakusatan", "Wanpakusatan", "SP", 8500, 850, 1700, 999, 66, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.WANPAKUSATAN, EnumDqmMonsterAIrate.WANPAKUSATAN),
	KIRATOTI(250, "DqmEntityKiratoti", "Kiratoti", "SP", 9500, 950, 2100, 999, 85, 5, 500, 0.5F, true, 50, 1000, 0, 4, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.KIRATOTI, EnumDqmMonsterAIrate.KIRATOTI),
	MASHOUGUMO(251, "DqmEntityMashougumo", "Mashougumo", "SP", 13000, 1300, 1600, 999, 79, 5, 500, 0.5F, true, 50, 1000, 0, 4, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.MASHOUGUMO, EnumDqmMonsterAIrate.MASHOUGUMO),
	SIRUBAMANTO(252, "DqmEntitySirubamanto", "Sirubamanto", "SP", 14000, 1400, 1900, 0, 100, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "UNDEAD", null, 1, 1, null, EnumDqmMonsterAI.SIRUBAMANTO, EnumDqmMonsterAIrate.SIRUBAMANTO),
	DARKRAMIA(253, "DqmEntityDarkRamia", "DarkRamia", "SP", 26000, 2600, 15000, 9999, 135, 13, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.DARKRAMIA, EnumDqmMonsterAIrate.DARKRAMIA),
	GODONHEDDO(254, "DqmEntityGodonheddo", "Godonheddo", "SP", 17000, 1700, 2200, 0, 110, 10, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.GODONHEDDO, EnumDqmMonsterAIrate.GODONHEDDO),
	ATORASU(255, "DqmEntityAtorasu", "Atorasu", "SP", 22000, 2200, 3000, 0, 120, 10, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.ATORASU, EnumDqmMonsterAIrate.ATORASU),
	YAMATANOOROTI(256, "DqmEntityYamatanooroti", "Yamatanooroti", "SP", 26800, 2680, 3600, 9999, 145, 13, 500, 0.5F, true, 50, 1000, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.YAMATANOOROTI, EnumDqmMonsterAIrate.YAMATANOOROTI),
	BAZUZU(257, "DqmEntityBazuzu", "Bazuzu", "SP", 26500, 2650, 4000, 0, 145, 12, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.BAZUZU, EnumDqmMonsterAIrate.BAZUZU),
	KIRAMAJINGA(258, "DqmEntityKiramajinga", "Kiramajinga", "SP", 27000, 2700, 4200, 0, 160, 20, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.KIRAMAJINGA, EnumDqmMonsterAIrate.KIRAMAJINGA),
	SURAIMUJENERARU(259, "DqmEntitySuraimujeneraru", "Suraimujeneraru", "SP", 27700, 2770, 4300, 9999, 180, 17, 500, 0.5F, true, 50, 1000, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.SURAIMUJENERARU, EnumDqmMonsterAIrate.SURAIMUJENERARU),
	BURASU(260, "DqmEntityBurasu", "Burasu", "SP", 9999, 100, 9999, 0, 100, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.BURASU, EnumDqmMonsterAIrate.BURASU),
	KANDATAKOBUN(261, "DqmEntityKandatakobun", "Kandatakobun", "SP", 1800, 300, 1800, 0, 60, 8, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.KANDATAKOBUN, EnumDqmMonsterAIrate.KANDATAKOBUN),
	KINGHIDORA(262, "DqmEntityKinghidora", "Kinghidora", "SP", 34000, 3400, 13500, 0, 135, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.KINGHIDORA, EnumDqmMonsterAIrate.KINGHIDORA),
	MASSO(263, "DqmEntityMasso", "Masso", "SP", 12000, 1800, 6000, 0, 85, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "DRAGON", null, 1, 1, null, EnumDqmMonsterAI.MASSO, EnumDqmMonsterAIrate.MASSO),
	PISARONAITO(264, "DqmEntityPisaronaito", "Pisaronaito", "SP", 12000, 800, 6310, 999, 90, 12, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.PISARONAITO, EnumDqmMonsterAIrate.PISARONAITO),
	PUREMIASURAIMU(265, "DqmEntityPuremiasuraimu", "Puremiasuraimu", "SP", 7777, 7777, 1234, 0, 88, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.PUREMIASURAIMU, EnumDqmMonsterAIrate.PUREMIASURAIMU),
	TATTYAN(266, "DqmEntityTattyan", "Tattyan", "SP", 17500, 2100, 2130, 0, 65, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.TATTYAN, EnumDqmMonsterAIrate.TATTYAN),
	TORORUBAKKOSU(267, "DqmEntityTororubakkosu", "Tororubakkosu", "SP", 11111, 20, 3100, 0, 190, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.TORORUBAKKOSU, EnumDqmMonsterAIrate.TORORUBAKKOSU),
	URAGIRIKOZOU(268, "DqmEntityUragirikozou", "Uragirikozou", "SP", 9000, 900, 1111, 999, 55, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.URAGIRIKOZOU, EnumDqmMonsterAIrate.URAGIRIKOZOU),
	FUREIZADO(269, "DqmEntityFureizado", "Fureizado", "SP", 28000, 1800, 4200, 9999, 100, 20, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.FUREIZADO, EnumDqmMonsterAIrate.FUREIZADO),
	SEIGIN(270, "DqmEntitySeigin", "Seigin", "TENSEI", 77777, 1556, 333, 0, 60, 24, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.SEIGIN, EnumDqmMonsterAIrate.SEIGIN),
	DEBIRURODO(271, "DqmEntityDebirurodo", "Debirurodo", "TENSEI", 12000, 1050, 1800, 9999, 75, 0, 500, 0.375F, false, 25, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.DEBIRURODO, EnumDqmMonsterAIrate.DEBIRURODO),
	MAABURUN(272, "DqmEntityMaaburun", "Maaburun", "TENSEI", 8000, 500, 1400, 9999, 70, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.MAABURUN, EnumDqmMonsterAIrate.MAABURUN),
	ARUKEMISUTON(273, "DqmEntityArukemisuton", "Arukemisuton", "TENSEI", 9000, 900, 1600, 9999, 72, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.ARUKEMISUTON, EnumDqmMonsterAIrate.ARUKEMISUTON),
	GORUDENKON(274, "DqmEntityGorudenkon", "Gorudenkon", "TENSEI", 10000, 1000, 1600, 9999, 80, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.GORUDENKON, EnumDqmMonsterAIrate.GORUDENKON),
	KUINMOMON(275, "DqmEntityKuinmomon", "Kuinmomon", "TENSEI", 11000, 1100, 1450, 9999, 82, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.KUINMOMON, EnumDqmMonsterAIrate.KUINMOMON),
	MOONKIMERA(276, "DqmEntityMoonkimera", "Moonkimera", "TENSEI", 11500, 1150, 1750, 9999, 77, 5, 500, 0.5F, true, 50, 1000, 0, 4, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.MOONKIMERA, EnumDqmMonsterAIrate.MOONKIMERA),
	TYOKONUBA(277, "DqmEntityTyokonuba", "Tyokonuba", "TENSEI", 10500, 1050, 1300, 9999, 76, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.TYOKONUBA, EnumDqmMonsterAIrate.TYOKONUBA),
	REDDOATYA(278, "DqmEntityReddoatya", "Reddoatya", "TENSEI", 12000, 1200, 1800, 9999, 83, 5, 500, 0.5F, true, 50, 1000, 0, 1, 1, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.REDDOATYA, EnumDqmMonsterAIrate.REDDOATYA),
	KIRAPIKE(279, "DqmEntityKirapike", "Kirapike", "TENSEI", 12500, 1250, 1800, 9999, 84, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.KIRAPIKE, EnumDqmMonsterAIrate.KIRAPIKE),
	TOGEKONBOU(280, "DqmEntityTogekonbou", "Togekonbou", "TENSEI", 13500, 1350, 1650, 9999, 90, 5, 500, 0.5F, true, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.TOGEKONBOU, EnumDqmMonsterAIrate.TOGEKONBOU),
	TAIPUG(281, "DqmEntityTaipug", "Taipug", "TENSEI", 18000, 1800, 2500, 9999, 105, 10, 500, 0.5F, false, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.TAIPUG, EnumDqmMonsterAIrate.TAIPUG),
	BEBINGOSATAN(282, "DqmEntityBebingosatan", "Bebingosatan", "TENSEI", 11000, 1100, 1400, 9999, 80, 5, 500, 0.5F, false, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.BEBINGOSATAN, EnumDqmMonsterAIrate.BEBINGOSATAN),
	GOLDMANTO(283, "DqmEntityGoldmanto", "Goldmanto", "TENSEI", 12000, 1200, 1800, 9999, 88, 15, 500, 0.5F, false, 50, 1000, 0, 1, 0, "UN", null, 1, 1, null, EnumDqmMonsterAI.GOLDMANTO, EnumDqmMonsterAIrate.GOLDMANTO),
	HATONAITO(284, "DqmEntityHatonaito", "Hatonaito", "TENSEI", 13000, 1300, 1750, 9999, 101, 10, 500, 0.5F, false, 50, 1000, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.HATONAITO, EnumDqmMonsterAIrate.HATONAITO),
	MADRAINBOW(285, "DqmEntityMadrainbow", "Madrainbow", "TENSEI", 10000, 1000, 1500, 9999, 75, 5, 500, 0.5F, false, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.MADRAINBOW, EnumDqmMonsterAIrate.MADRAINBOW),
	METARUHOIMIN(286, "DqmEntityMetaruhoimin", "Metaruhoimin", "TENSEI", 33333, 777, 111, 9999, 65, 24, 500, 0.5F, false, 50, 1000, 0, 1, 0, "METARU", null, 1, 1, null, EnumDqmMonsterAI.METARUHOIMIN, EnumDqmMonsterAIrate.METARUHOIMIN),
	MOMOIROSANSIMAI(287, "DqmEntityMomoirosansimai", "Momoirosansimai", "TENSEI", 9999, 999, 1111, 9999, 68, 5, 500, 0.5F, false, 50, 1000, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.MOMOIROSANSIMAI, EnumDqmMonsterAIrate.MOMOIROSANSIMAI),
	NOROINOIWA(288, "DqmEntityNoroinoiwa", "Noroinoiwa", "TENSEI", 14140, 1414, 1414, 9999, 50, 13, 500, 0.125F, false, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.NOROINOIWA, EnumDqmMonsterAIrate.NOROINOIWA),
	PINKBONBON(289, "DqmEntityPinkbonbon", "Pinkbonbon", "TENSEI", 10000, 1000, 1300, 9999, 70, 5, 500, 0.5F, false, 50, 1000, 0, 1, 0, "BEAST", null, 1, 1, null, EnumDqmMonsterAI.PINKBONBON, EnumDqmMonsterAIrate.PINKBONBON),
	SABOTENGOLD(290, "DqmEntitySabotengold", "Sabotengold", "TENSEI", 9000, 22222, 222, 9999, 65, 23, 500, 0.5F, false, 50, 1000, 0, 1, 0, "SIZEN", null, 1, 1, null, EnumDqmMonsterAI.SABOTENGOLD, EnumDqmMonsterAIrate.SABOTENGOLD),
	SHUVALUTS(291, "DqmEntityShuvaluts", "Shuvaluts", "TENSEI", 16000, 1600, 2100, 9999, 103, 10, 500, 0.5F, false, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.SHUVALUTS, EnumDqmMonsterAIrate.SHUVALUTS),
	SIRUDOANIKI(292, "DqmEntitySirudoaniki", "Sirudoaniki", "TENSEI", 12000, 1200, 1500, 9999, 91, 16, 500, 0.5F, false, 50, 1000, 0, 1, 0, "AKUMA", null, 1, 1, null, EnumDqmMonsterAI.SIRUDOANIKI, EnumDqmMonsterAIrate.SIRUDOANIKI),
	SWEETBAG(293, "DqmEntitySweetbag", "Sweetbag", "TENSEI", 11111, 7777, 1999, 9999, 77, 5, 500, 0.5F, false, 50, 1000, 0, 1, 0, "BUSSITU", null, 1, 1, null, EnumDqmMonsterAI.SWEETBAG, EnumDqmMonsterAIrate.SWEETBAG),
	TUMURINMAMA(294, "DqmEntityTumurinmama", "Tumurinmama", "TENSEI", 10000, 1000, 1400, 9999, 68, 10, 500, 0.5F, false, 50, 1000, 0, 1, 0, "SURAIMU", null, 1, 1, null, EnumDqmMonsterAI.TUMURINMAMA, EnumDqmMonsterAIrate.TUMURINMAMA),
	GOROTUKI(295, "DqmEntityGorotuki", "Gorotuki", "NIGHT", 170, 20, 135, 0, 27, 0, 15, 0.15F, false, 15, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.GOROTUKI, EnumDqmMonsterAIrate.GOROTUKI),
	ERIMINATOR(296, "DqmEntityEriminator", "Eriminator", "HELL", 620, 35, 320, 30, 64, 0, 30, 0.175F, true, 20, 500, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.ERIMINATOR, EnumDqmMonsterAIrate.ERIMINATOR),
	DESUSUTOKA(297, "DqmEntityDesusutoka", "Desusutoka", "END", 980, 70, 440, 0, 70, 0, 50, 0.175F, false, 10, 300, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.DESUSUTOKA, EnumDqmMonsterAIrate.DESUSUTOKA),
	KANDATA(298, "DqmEitntyKandata", "Kandata", "SP", 20000, 10000, 9999, 9999, 111, 10, 500, 0.375F, true, 50, 1000, 0, 1, 0, "UNKNOWN", null, 1, 1, null, EnumDqmMonsterAI.KANDATA, EnumDqmMonsterAIrate.KANDATA);



	private final int id;
	private final String MobClassName;
	private final String MobName;
	private final String MobCateg;
	private final int EXP;
	private final int GOLD;
	private final double HP;
	private final int MP;
	private final double PW;
	private final int DF;
	private final int XPS;
	private final float SPEED;
	private final boolean CFIRE;
	private final int CPET;
	private final int CTENSEI;
	private final int CTENSEIsp;
	private final int KougekiPat;
	private final boolean CAI;
	private final String MobRoot;
	private final String TenseiMob;
	private final int TenseiMin;
	private final int TenseiMax;
	private final String KakuseiMob;
	private final EnumDqmMonsterAI mobAI;
	private final EnumDqmMonsterAIrate mobAIrate;

	private EnumDqmMonster(int id, String ClassName, String MobName, String MobCateg, int EXP, int GOLD, double HP, int MP, double PW, int DF, int XPS, float SPEED,
			               boolean CFIRE, int CPET, int CTENSEI, int CTENSEIsp, int KougekiPat, int CAI, String MobRoot, String TenseiMob, int TenseiMin, int TenseiMax, String KakuseiMob,
			               EnumDqmMonsterAI mobAI, EnumDqmMonsterAIrate mobAIrate)
	{
		this.id = id;
		this.MobClassName = ClassName;
		this.MobName = MobName;
		this.MobCateg = MobCateg;
		this.EXP = EXP;
		this.GOLD = GOLD;
		this.HP = HP;
		this.MP = MP;
		this.PW = PW;
		this.DF = DF;
		this.XPS = XPS;
		this.SPEED = SPEED;
		this.CFIRE = CFIRE;
		this.CPET = CPET;
		this.CTENSEI = CTENSEI;
		this.CTENSEIsp = CTENSEIsp;
		this.KougekiPat = KougekiPat;

		if(CAI == 0)
		{
			this.CAI = false;
		}else
		{
			this.CAI = true;
		}

		//this.CAI = CAI==0?false:true;
		this.MobRoot = MobRoot;
		this.TenseiMob = TenseiMob;
		this.TenseiMin = TenseiMin;
		this.TenseiMax = TenseiMax;
		this.KakuseiMob = KakuseiMob;

		this.mobAI = mobAI;
		this.mobAIrate = mobAIrate;

	}

	public int getId() {
		return id;
	}

	public String getMobClassName() {
		return MobClassName;
	}

	public String getMobName() {
		return MobName;
	}

	public String getMobCateg() {
		return MobCateg;
	}

	public int getEXP() {
		return EXP;
	}

	public int getGOLD() {
		return GOLD;
	}

	public double getHP() {
		return HP;
	}

	public int getMP() {
		return MP;
	}

	public double getPW() {
		return PW;
	}

	public int getDF() {
		return DF;
	}

	public int getXPS() {
		return XPS;
	}

	public float getSPEED() {
		return SPEED;
	}

	public boolean isCFIRE() {
		return CFIRE;
	}

	public int getCPET() {
		return CPET;
	}

	public int getCTENSEI() {
		return CTENSEI;
	}

	public int getCTENSEIsp() {
		return CTENSEIsp;
	}

	public int getKougekiPat() {
		return KougekiPat;
	}

	public boolean isCAI() {
		//return CAI;
		return true;
	}

	public String getMobRoot() {
		return MobRoot;
	}

	public String getTenseiMob() {
		return TenseiMob;
	}

	public int getTenseiMin() {
		return TenseiMin;
	}

	public int getTenseiMax() {
		return TenseiMax;
	}

	public String getKakuseiMob() {
		return KakuseiMob;
	}

	public EnumDqmMonsterAI getMonsterAI() {
		return mobAI;
	}

	public EnumDqmMonsterAIrate getMonsterAIrate() {
		return mobAIrate;
	}
}
