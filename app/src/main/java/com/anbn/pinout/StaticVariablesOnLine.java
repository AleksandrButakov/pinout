package com.anbn.pinout;

public class StaticVariablesOnLine {

    /* создадим текстовый массив с вариатами выбора оборудования
    1. СМК-30 MUX
    2. СМК-30 КС
    3. Радиостанции РЛСМ-10-ХХ
    4. МДК-ХХ", "ПСГО (ЦИСОП, ППУ
    5. Прочее оборудование Пульсар     */
    public static final String[] SEQUIPMENT = {
            "Выберите оборудование...",
            "Cisco Systems",
            "DX500",
            "ECI Telecom"};

    //  Оборудование Cisco Systems
    public static final String[] CARD1 = {
            "Выберите интерфейсную плату...",
            "Cisco 2800 series",
            "Cisco ME3400",
            "Cisco ASR-920",
            "Cisco ASR-9001"};

    //  Оборудование DX500
    public static final String[] CARD2 = {
            "Выберите интерфейсную плату...",
            "DX-500 техническое описание"};

    //  Оборудование ECI Telecom
    public static final String[] CARD3 = {
            "Выберите оборудование...",
            "NPT-1020 equipment"};

}
