package com.anbn.pinout;

public class StaticVariablesOnLine {

    // создадим текстовый массив с вариатами выбора оборудования
    public static final String[] SEQUIPMENT = {
            "Выберите оборудование...",
            "Cisco Systems",
            "Оборудование DX500",
            "ECI Telecom"};

    //  Оборудование Cisco Systems
    public static final String[] CARD1 = {
            "Выберите интерфейсную плату...",
            "Cisco 2800 series",    // 1, 1
            "Cisco ME3400",         // 1, 2
            "Cisco ASR-920",        // 1, 3
            "Cisco ASR-9001"};      // 1, 4
    // массив с адресами файлов
    public static final String[] CARD1URL =
            {
                    "",
                    "https://drive.google.com/file/d/1yohATBDDST7ceyVw3_o_eM6JNPprmL6E/view?usp=sharing",
                    "https://drive.google.com/file/d/1Fv70gRBZ6w6BVQ8gy_UEUsKVJtjySLft/view?usp=sharing",
                    "https://drive.google.com/file/d/1JR_z1flqLZ62mmGWOu7nGpKiKDmrPpKh/view?usp=sharing",
                    "https://drive.google.com/file/d/1VTD3Stv7oIxsUcYOqm4hnpWhKE2dZyBe/view?usp=sharing"
            };

    //  Оборудование DX500
    public static final String[] CARD2 = {
            "Выберите интерфейсную плату...",
            "DX-500 техническое описание"};     // 2, 1
    // массив с адресами файлов
    public static final String[] CARD2URL =
            {
                    "",
                    "https://drive.google.com/file/d/1nKDPbITN1hXF3caCPwXUVcEHFRh6ZlrY/view?usp=sharing"
            };

    //  Оборудование ECI Telecom
    public static final String[] CARD3 = {
            "Выберите оборудование...",
            "NPT-1020 equipment"};      // 3, 1
    // массив с адресами файлов
    public static final String[] CARD3URL =
            {
                    "",
                    "https://drive.google.com/file/d/1ez8jh1JgwGaJaQ-MTRWPEySav6HdLXhR/view?usp=sharing"
            };



}
