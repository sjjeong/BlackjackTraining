package com.dino.blackjackpedigree.model.enums

enum class PlayerCardCategory(
    val isContainA: Boolean,
    val isPair: Boolean
) {
    C_5(false, false),
    C_6(false, false),
    C_7(false, false),
    C_8(false, false),
    C_9(false, false),
    C_10(false, false),
    C_11(false, false),
    C_12(false, false),
    C_13(false, false),
    C_14(false, false),
    C_15(false, false),
    C_16(false, false),
    C_17(false, false),
    C_18(false, false),
    C_19(false, false),
    C_A2(true, false),
    C_A3(true, false),
    C_A4(true, false),
    C_A5(true, false),
    C_A6(true, false),
    C_A7(true, false),
    C_A8(true, false),
    C_A9(true, false),
    C_AA(true, true),
    C_22(false, true),
    C_33(false, true),
    C_44(false, true),
    C_55(false, true),
    C_66(false, true),
    C_77(false, true),
    C_88(false, true),
    C_99(false, true),
    C_1010(false, true),
}
