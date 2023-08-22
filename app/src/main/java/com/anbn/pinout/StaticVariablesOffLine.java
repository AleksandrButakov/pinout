package com.anbn.pinout;

public class StaticVariablesOffLine {

    /* создадим текстовый массив с вариатами выбора оборудования
    1. СМК-30 MUX
    2. СМК-30 КС
    3. Радиостанции РЛСМ-10-ХХ
    4. МДК-ХХ", "ПСГО (ЦИСОП, ППУ
    5. Прочее оборудование Пульсар     */

    public static final String[] SEQUIPMENT = {
            "Выберите оборудование...",
            "СМК-30 MUX",
            "СМК-30 КС",
            "МДК-ХХ (М1, М3, М4. М5, М7...)",
            "Радиостанции РЛСМ-10-ХХ",
            "ПСГО (ЦИСОП, ППУ)",
            "Прочее оборудование Пульсар",
            "ECI Telecom (NPT, CWDM, DWDM)",
            "Оборудование Cisco, ВСТСПД",
            "Кабели для настройки устройств",
            "Оборудование DX-500",
            "Волоконно-оптические кабели"};

    //  Платы оборудования СМК-30 MUX
    public static final String[] CARD1 = {
            "Выберите интерфейсную плату...",
            "096. РЭ СМК-30 (MUX) v2.6",
            "СМА-2-4 (.03) в. 1.6.1",
            "СМА-2-4 (.04) в. 2.1",
            "СМА-2-4И (MUX) v.2.1",
            "СМА-3-4 (MUX) v.1.3",
            "СМА-4-4 (012.03) в.2",
            "СМА-4-4Д MUX (027.03) в.3.4",
            "СМГП-8 (MUX) v.1.8",
            "СМЛТ-2С (053.01) v1.0.5 (MUX)",
            "СМЛТ-2СД (052.01) v1.2 (MUX)",
            "СМОПС (MUX) v.1.2",
            "СМПЕ1-4 (038.01) в.2.1",
            "СМПП (034.01) в 3.2",
            "СМТТ-1 v.1.2",
            "СМЦГ-4 v.1.4",
            "СМЦД-4 v.1.1",
            "СМЦИ-4C (.03) в.1.3",
            "СМЦИ-4К (.01) в.2.1",
            "СМЦК-4П (MUX) в.1.2",
            "СМЦП-4 v.1.3",
            "СМЦПД-4 (MUX) v.1.2",
            "СМЦС-4 (.01) в.4",
            "СМЦС-4 (ПС) v.1",
            "СМЦС-4С v.4",
            "СМЦТ-8 v.1.3"};

    //  Платы оборудования СМК-30 КС
    public static final String[] CARD2 = {
            "Выберите интерфейсную плату...",
            "007. КС СМК-30 РЭ v.2.5",
            "100. СМК-30 КС (РЖД) v.1.5.10",
            "СМА-2-2П (.01) v.1.11",
            "СМА-2-2П (.04) v.1.11",
            "СМА-2-4И (КС) v.2.1",
            "СМА-2-8 (.04) в.1.5.1",
            "СМА-3-4 (КС) v.1.4",
            "СМА-4-4Д КС (04) в.3.3",
            "СМГП-8 (КС) v.1.8",
            "СМЛТ-2С (053.02) v.1.0.6 (КС)",
            "СМЛТ-2СД (052.02) v.1.1 (КС)",
            "СМОПС (КС) v.1.0",
            "СМЦК-4П (КС) в.1.3",
            "СМЦК-4П (ПС1) v.1.6",
            "СМЦПД-4 (КС) v.2.2",
            "СМЦПД-8 (КС) v.1.4"};

    //  Оборудование МДК-ХХ
    public static final String[] CARD3 = {
            "Выберите оборудование...",
            "008. МДК. Тех. решения 8.2.3",
            "031. РЭ МДК-М1 v2.2 (ПО 2.6 и выше)",
            "032. РЭ МДК-М3 v.1.6",
            "033. РЭ МДК-М4 v1.2",
            "034. РЭ МДК-М5 v.1.1",
            "035. РЭ МДК-М5Т v.2.4.2",
            "036. РЭ МДК-М6 v.1.1",
            "037. РЭ МДК-М7 v.2.4.1",
            "038. РЭ МДК-М8 v.1.1",
            "039. РЭ МДК-М11 v.1.0",
            "040. РЭ МДК-М12 v.1.1.5",
            "042. РЭ МИГ-2АТ v.2",
            "044. РЭ МИГ-2БМ v.1.2",
            "046. РЭ МИГ-2РМ v.1.1",
            "РЭ МДК-М10"};

    //  Модель радиостанции
    public static final String[] CARD4 = {
            "Выберите модель радиостанции...",
            "014. РЭ РЛСМ-10 (1 часть) V.5.94 (ПУ, ПД)",
            "014.1. РЛСМ-10-08 РЭ (1 часть) V.1.3.2",
            "018. РЛСМ-10-40 РЭ v4.7",
            "020. РЭ РЛСМ 10-60 v.1.4",
            "104. РЛСМ-10-60 РЭ (1 часть)_1.5"};

    //  Оборудование ПСГО
    public static final String[] CARD5 = {
            "Выберите оборудование ПСГО...",
            "051. РЭ ППУ-А (001-07) v.2.4",
            "051.1. РЭ ППУ-АМ v.1.1",
            "052. РЭ ППУ-А-ВС (002-04) v.2.4",
            "053. РЭ ППУ-А-У (001-08) v.2.4",
            "053.1. РЭ ППУ-АМ-У v.1.2",
            "054. РЭ ППУ-А-УВС (002-05) v.2.0",
            "107. УМК 250 РЭ в.3.2"};

    //  Различное оборудование Пульсар
    public static final String[] CARD6 = {
            "Выберите оборудование Пульсар ...",
            "РЭ МЦФЛ-1М _KC+MUX",
            "010. МИ-4УК РЭ в.1.6.2",
            "013. ПР РЭ в.2.6",
            "022. ЦКС АЛЬФА РЭ в.1.1 рек",
            "026. РЭ БПА-2 v.1.3",
            "027. РЭ БУР-32 v.2.0",
            "028. РЭ ИР-32 v1.3",
            "030. РЭ КЦССМ 01 v.4.2",
            "041. РЭ МИ-4П v.1.7",
            "047. РЭ МК v1.4",
            "050. РЭ ПДСУ А5 v.1.1",
            "056. РЭ РЛТ-1 исп.1 v2.2",
            "087. РЭ СССЦ v.2.1",
            "097. СС РЭ v.1.3",
            "103. Типовые решени УМК-4"};

    // ECI Teleom (NPT, CWDM, DWDM, ВСТСПД)
    public static final String[] CARD7 = {
            "Выберите оборудование ECI, ВСТСПД ...",
            "CWDM_prism",
            "DWDM_prism",
            "SFP_module"};

    // Оборудование Cisco
    public static final String[] CARD8 = {
            "Выберите оборудование Cisco ...",
            "RJ-45 connector Ethernet",
            "RJ-45 Eth, E1. RJ-11 SHDLS Line, (RJ45, RJ11)",
            "SFP_module",
            "Оборудование ВСТСПД",
            "ASR-920-12_CWDM_ODF",
            "ASR-920 and ASR-9001"};

    // Кабели для настройки устройств
    public static final String[] CARD9 = {
            "Выберите тип кабеля ...",
            "Кабели для настройки устройств"};

    // Оборудование DX500
    public static final String[] CARD10 = {
            "Выберите оборудование ...",
            "DX-500 подключение интерфейсов"};

    // Волоконно-оптические кабели
    public static final String[] CARD11 = {
            "Выберите оборудование ...",
            "Оптические коннекторы"};

}