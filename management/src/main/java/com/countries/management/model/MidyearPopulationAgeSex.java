package com.countries.management.model;

import javax.persistence.*;

@Entity
@Table(name = "midyear_population_age_sex")
public class MidyearPopulationAgeSex {
	@EmbeddedId
	private MidyearPopulationAgeSexId id;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "population_age_0")
    private int populationAge0;

    @Column(name = "population_age_1")
    private int populationAge1;

    @Column(name = "population_age_2")
    private int populationAge2;

    @Column(name = "population_age_3")
    private int populationAge3;

    @Column(name = "population_age_4")
    private int populationAge4;

    @Column(name = "population_age_5")
    private int populationAge5;

    @Column(name = "population_age_6")
    private int populationAge6;

    @Column(name = "population_age_7")
    private int populationAge7;

    @Column(name = "population_age_8")
    private int populationAge8;

    @Column(name = "population_age_9")
    private int populationAge9;

    @Column(name = "population_age_10")
    private int populationAge10;

    @Column(name = "population_age_11")
    private int populationAge11;

    @Column(name = "population_age_12")
    private int populationAge12;

    @Column(name = "population_age_13")
    private int populationAge13;

    @Column(name = "population_age_14")
    private int populationAge14;

    @Column(name = "population_age_15")
    private int populationAge15;

    @Column(name = "population_age_16")
    private int populationAge16;

    @Column(name = "population_age_17")
    private int populationAge17;

    @Column(name = "population_age_18")
    private int populationAge18;

    @Column(name = "population_age_19")
    private int populationAge19;

    @Column(name = "population_age_20")
    private int populationAge20;

    @Column(name = "population_age_21")
    private int populationAge21;

    @Column(name = "population_age_22")
    private int populationAge22;

    @Column(name = "population_age_23")
    private int populationAge23;

    @Column(name = "population_age_24")
    private int populationAge24;

    @Column(name = "population_age_25")
    private int populationAge25;

    @Column(name = "population_age_26")
    private int populationAge26;

    @Column(name = "population_age_27")
    private int populationAge27;

    @Column(name = "population_age_28")
    private int populationAge28;

    @Column(name = "population_age_29")
    private int populationAge29;

    @Column(name = "population_age_30")
    private int populationAge30;

    @Column(name = "population_age_31")
    private int populationAge31;

    @Column(name = "population_age_32")
    private int populationAge32;

    @Column(name = "population_age_33")
    private int populationAge33;

    @Column(name = "population_age_34")
    private int populationAge34;

    @Column(name = "population_age_35")
    private int populationAge35;

    @Column(name = "population_age_36")
    private int populationAge36;

    @Column(name = "population_age_37")
    private int populationAge37;

    @Column(name = "population_age_38")
    private int populationAge38;

    @Column(name = "population_age_39")
    private int populationAge39;

    @Column(name = "population_age_40")
    private int populationAge40;

    @Column(name = "population_age_41")
    private int populationAge41;

    @Column(name = "population_age_42")
    private int populationAge42;

    @Column(name = "population_age_43")
    private int populationAge43;

    @Column(name = "population_age_44")
    private int populationAge44;

    @Column(name = "population_age_45")
    private int populationAge45;
    
    @Column(name = "population_age_46")
    private int populationAge46;

    @Column(name = "population_age_47")
    private int populationAge47;

    @Column(name = "population_age_48")
    private int populationAge48;

    @Column(name = "population_age_49")
    private int populationAge49;

    @Column(name = "population_age_50")
    private int populationAge50;

    @Column(name = "population_age_51")
    private int populationAge51;

    @Column(name = "population_age_52")
    private int populationAge52;

    @Column(name = "population_age_53")
    private int populationAge53;

    @Column(name = "population_age_54")
    private int populationAge54;

    @Column(name = "population_age_55")
    private int populationAge55;

    @Column(name = "population_age_56")
    private int populationAge56;

    @Column(name = "population_age_57")
    private int populationAge57;

    @Column(name = "population_age_58")
    private int populationAge58;

    @Column(name = "population_age_59")
    private int populationAge59;

    @Column(name = "population_age_60")
    private int populationAge60;

    @Column(name = "population_age_61")
    private int populationAge61;

    @Column(name = "population_age_62")
    private int populationAge62;

    @Column(name = "population_age_63")
    private int populationAge63;

    @Column(name = "population_age_64")
    private int populationAge64;

    @Column(name = "population_age_65")
    private int populationAge65;

    @Column(name = "population_age_66")
    private int populationAge66;

    @Column(name = "population_age_67")
    private int populationAge67;

    @Column(name = "population_age_68")
    private int populationAge68;

    @Column(name = "population_age_69")
    private int populationAge69;

    @Column(name = "population_age_70")
    private int populationAge70;

    @Column(name = "population_age_71")
    private int populationAge71;

    @Column(name = "population_age_72")
    private int populationAge72;

    @Column(name = "population_age_73")
    private int populationAge73;

    @Column(name = "population_age_74")
    private int populationAge74;

    @Column(name = "population_age_75")
    private int populationAge75;

    @Column(name = "population_age_76")
    private int populationAge76;

    @Column(name = "population_age_77")
    private int populationAge77;

    @Column(name = "population_age_78")
    private int populationAge78;

    @Column(name = "population_age_79")
    private int populationAge79;

    @Column(name = "population_age_80")
    private int populationAge80;

    @Column(name = "population_age_81")
    private int populationAge81;

    @Column(name = "population_age_82")
    private int populationAge82;

    @Column(name = "population_age_83")
    private int populationAge83;

    @Column(name = "population_age_84")
    private int populationAge84;

    @Column(name = "population_age_85")
    private int populationAge85;
    @Column(name = "population_age_86")
    private int populationAge86;

    @Column(name = "population_age_87")
    private int populationAge87;

    @Column(name = "population_age_88")
    private int populationAge88;

    @Column(name = "population_age_89")
    private int populationAge89;

    @Column(name = "population_age_90")
    private int populationAge90;

    @Column(name = "population_age_91")
    private int populationAge91;

    @Column(name = "population_age_92")
    private int populationAge92;

    @Column(name = "population_age_93")
    private int populationAge93;

    @Column(name = "population_age_94")
    private int populationAge94;

    @Column(name = "population_age_95")
    private int populationAge95;

    @Column(name = "population_age_96")
    private int populationAge96;

    @Column(name = "population_age_97")
    private int populationAge97;

    @Column(name = "population_age_98")
    private int populationAge98;

    @Column(name = "population_age_99")
    private int populationAge99;

    @Column(name = "population_age_100")
    private int populationAge100;

	public MidyearPopulationAgeSex(MidyearPopulationAgeSexId id, String countryCode, String countryName,
			int populationAge0, int populationAge1, int populationAge2, int populationAge3, int populationAge4,
			int populationAge5, int populationAge6, int populationAge7, int populationAge8, int populationAge9,
			int populationAge10, int populationAge11, int populationAge12, int populationAge13, int populationAge14,
			int populationAge15, int populationAge16, int populationAge17, int populationAge18, int populationAge19,
			int populationAge20, int populationAge21, int populationAge22, int populationAge23, int populationAge24,
			int populationAge25, int populationAge26, int populationAge27, int populationAge28, int populationAge29,
			int populationAge30, int populationAge31, int populationAge32, int populationAge33, int populationAge34,
			int populationAge35, int populationAge36, int populationAge37, int populationAge38, int populationAge39,
			int populationAge40, int populationAge41, int populationAge42, int populationAge43, int populationAge44,
			int populationAge45, int populationAge46, int populationAge47, int populationAge48, int populationAge49,
			int populationAge50, int populationAge51, int populationAge52, int populationAge53, int populationAge54,
			int populationAge55, int populationAge56, int populationAge57, int populationAge58, int populationAge59,
			int populationAge60, int populationAge61, int populationAge62, int populationAge63, int populationAge64,
			int populationAge65, int populationAge66, int populationAge67, int populationAge68, int populationAge69,
			int populationAge70, int populationAge71, int populationAge72, int populationAge73, int populationAge74,
			int populationAge75, int populationAge76, int populationAge77, int populationAge78, int populationAge79,
			int populationAge80, int populationAge81, int populationAge82, int populationAge83, int populationAge84,
			int populationAge85, int populationAge86, int populationAge87, int populationAge88, int populationAge89,
			int populationAge90, int populationAge91, int populationAge92, int populationAge93, int populationAge94,
			int populationAge95, int populationAge96, int populationAge97, int populationAge98, int populationAge99,
			int populationAge100) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.populationAge0 = populationAge0;
		this.populationAge1 = populationAge1;
		this.populationAge2 = populationAge2;
		this.populationAge3 = populationAge3;
		this.populationAge4 = populationAge4;
		this.populationAge5 = populationAge5;
		this.populationAge6 = populationAge6;
		this.populationAge7 = populationAge7;
		this.populationAge8 = populationAge8;
		this.populationAge9 = populationAge9;
		this.populationAge10 = populationAge10;
		this.populationAge11 = populationAge11;
		this.populationAge12 = populationAge12;
		this.populationAge13 = populationAge13;
		this.populationAge14 = populationAge14;
		this.populationAge15 = populationAge15;
		this.populationAge16 = populationAge16;
		this.populationAge17 = populationAge17;
		this.populationAge18 = populationAge18;
		this.populationAge19 = populationAge19;
		this.populationAge20 = populationAge20;
		this.populationAge21 = populationAge21;
		this.populationAge22 = populationAge22;
		this.populationAge23 = populationAge23;
		this.populationAge24 = populationAge24;
		this.populationAge25 = populationAge25;
		this.populationAge26 = populationAge26;
		this.populationAge27 = populationAge27;
		this.populationAge28 = populationAge28;
		this.populationAge29 = populationAge29;
		this.populationAge30 = populationAge30;
		this.populationAge31 = populationAge31;
		this.populationAge32 = populationAge32;
		this.populationAge33 = populationAge33;
		this.populationAge34 = populationAge34;
		this.populationAge35 = populationAge35;
		this.populationAge36 = populationAge36;
		this.populationAge37 = populationAge37;
		this.populationAge38 = populationAge38;
		this.populationAge39 = populationAge39;
		this.populationAge40 = populationAge40;
		this.populationAge41 = populationAge41;
		this.populationAge42 = populationAge42;
		this.populationAge43 = populationAge43;
		this.populationAge44 = populationAge44;
		this.populationAge45 = populationAge45;
		this.populationAge46 = populationAge46;
		this.populationAge47 = populationAge47;
		this.populationAge48 = populationAge48;
		this.populationAge49 = populationAge49;
		this.populationAge50 = populationAge50;
		this.populationAge51 = populationAge51;
		this.populationAge52 = populationAge52;
		this.populationAge53 = populationAge53;
		this.populationAge54 = populationAge54;
		this.populationAge55 = populationAge55;
		this.populationAge56 = populationAge56;
		this.populationAge57 = populationAge57;
		this.populationAge58 = populationAge58;
		this.populationAge59 = populationAge59;
		this.populationAge60 = populationAge60;
		this.populationAge61 = populationAge61;
		this.populationAge62 = populationAge62;
		this.populationAge63 = populationAge63;
		this.populationAge64 = populationAge64;
		this.populationAge65 = populationAge65;
		this.populationAge66 = populationAge66;
		this.populationAge67 = populationAge67;
		this.populationAge68 = populationAge68;
		this.populationAge69 = populationAge69;
		this.populationAge70 = populationAge70;
		this.populationAge71 = populationAge71;
		this.populationAge72 = populationAge72;
		this.populationAge73 = populationAge73;
		this.populationAge74 = populationAge74;
		this.populationAge75 = populationAge75;
		this.populationAge76 = populationAge76;
		this.populationAge77 = populationAge77;
		this.populationAge78 = populationAge78;
		this.populationAge79 = populationAge79;
		this.populationAge80 = populationAge80;
		this.populationAge81 = populationAge81;
		this.populationAge82 = populationAge82;
		this.populationAge83 = populationAge83;
		this.populationAge84 = populationAge84;
		this.populationAge85 = populationAge85;
		this.populationAge86 = populationAge86;
		this.populationAge87 = populationAge87;
		this.populationAge88 = populationAge88;
		this.populationAge89 = populationAge89;
		this.populationAge90 = populationAge90;
		this.populationAge91 = populationAge91;
		this.populationAge92 = populationAge92;
		this.populationAge93 = populationAge93;
		this.populationAge94 = populationAge94;
		this.populationAge95 = populationAge95;
		this.populationAge96 = populationAge96;
		this.populationAge97 = populationAge97;
		this.populationAge98 = populationAge98;
		this.populationAge99 = populationAge99;
		this.populationAge100 = populationAge100;
	}

	public MidyearPopulationAgeSex() {}

	public MidyearPopulationAgeSexId getId() {
		return id;
	}

	public void setId(MidyearPopulationAgeSexId id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getPopulationAge0() {
		return populationAge0;
	}

	public void setPopulationAge0(int populationAge0) {
		this.populationAge0 = populationAge0;
	}

	public int getPopulationAge1() {
		return populationAge1;
	}

	public void setPopulationAge1(int populationAge1) {
		this.populationAge1 = populationAge1;
	}

	public int getPopulationAge2() {
		return populationAge2;
	}

	public void setPopulationAge2(int populationAge2) {
		this.populationAge2 = populationAge2;
	}

	public int getPopulationAge3() {
		return populationAge3;
	}

	public void setPopulationAge3(int populationAge3) {
		this.populationAge3 = populationAge3;
	}

	public int getPopulationAge4() {
		return populationAge4;
	}

	public void setPopulationAge4(int populationAge4) {
		this.populationAge4 = populationAge4;
	}

	public int getPopulationAge5() {
		return populationAge5;
	}

	public void setPopulationAge5(int populationAge5) {
		this.populationAge5 = populationAge5;
	}

	public int getPopulationAge6() {
		return populationAge6;
	}

	public void setPopulationAge6(int populationAge6) {
		this.populationAge6 = populationAge6;
	}

	public int getPopulationAge7() {
		return populationAge7;
	}

	public void setPopulationAge7(int populationAge7) {
		this.populationAge7 = populationAge7;
	}

	public int getPopulationAge8() {
		return populationAge8;
	}

	public void setPopulationAge8(int populationAge8) {
		this.populationAge8 = populationAge8;
	}

	public int getPopulationAge9() {
		return populationAge9;
	}

	public void setPopulationAge9(int populationAge9) {
		this.populationAge9 = populationAge9;
	}

	public int getPopulationAge10() {
		return populationAge10;
	}

	public void setPopulationAge10(int populationAge10) {
		this.populationAge10 = populationAge10;
	}

	public int getPopulationAge11() {
		return populationAge11;
	}

	public void setPopulationAge11(int populationAge11) {
		this.populationAge11 = populationAge11;
	}

	public int getPopulationAge12() {
		return populationAge12;
	}

	public void setPopulationAge12(int populationAge12) {
		this.populationAge12 = populationAge12;
	}

	public int getPopulationAge13() {
		return populationAge13;
	}

	public void setPopulationAge13(int populationAge13) {
		this.populationAge13 = populationAge13;
	}

	public int getPopulationAge14() {
		return populationAge14;
	}

	public void setPopulationAge14(int populationAge14) {
		this.populationAge14 = populationAge14;
	}

	public int getPopulationAge15() {
		return populationAge15;
	}

	public void setPopulationAge15(int populationAge15) {
		this.populationAge15 = populationAge15;
	}

	public int getPopulationAge16() {
		return populationAge16;
	}

	public void setPopulationAge16(int populationAge16) {
		this.populationAge16 = populationAge16;
	}

	public int getPopulationAge17() {
		return populationAge17;
	}

	public void setPopulationAge17(int populationAge17) {
		this.populationAge17 = populationAge17;
	}

	public int getPopulationAge18() {
		return populationAge18;
	}

	public void setPopulationAge18(int populationAge18) {
		this.populationAge18 = populationAge18;
	}

	public int getPopulationAge19() {
		return populationAge19;
	}

	public void setPopulationAge19(int populationAge19) {
		this.populationAge19 = populationAge19;
	}

	public int getPopulationAge20() {
		return populationAge20;
	}

	public void setPopulationAge20(int populationAge20) {
		this.populationAge20 = populationAge20;
	}

	public int getPopulationAge21() {
		return populationAge21;
	}

	public void setPopulationAge21(int populationAge21) {
		this.populationAge21 = populationAge21;
	}

	public int getPopulationAge22() {
		return populationAge22;
	}

	public void setPopulationAge22(int populationAge22) {
		this.populationAge22 = populationAge22;
	}

	public int getPopulationAge23() {
		return populationAge23;
	}

	public void setPopulationAge23(int populationAge23) {
		this.populationAge23 = populationAge23;
	}

	public int getPopulationAge24() {
		return populationAge24;
	}

	public void setPopulationAge24(int populationAge24) {
		this.populationAge24 = populationAge24;
	}

	public int getPopulationAge25() {
		return populationAge25;
	}

	public void setPopulationAge25(int populationAge25) {
		this.populationAge25 = populationAge25;
	}

	public int getPopulationAge26() {
		return populationAge26;
	}

	public void setPopulationAge26(int populationAge26) {
		this.populationAge26 = populationAge26;
	}

	public int getPopulationAge27() {
		return populationAge27;
	}

	public void setPopulationAge27(int populationAge27) {
		this.populationAge27 = populationAge27;
	}

	public int getPopulationAge28() {
		return populationAge28;
	}

	public void setPopulationAge28(int populationAge28) {
		this.populationAge28 = populationAge28;
	}

	public int getPopulationAge29() {
		return populationAge29;
	}

	public void setPopulationAge29(int populationAge29) {
		this.populationAge29 = populationAge29;
	}

	public int getPopulationAge30() {
		return populationAge30;
	}

	public void setPopulationAge30(int populationAge30) {
		this.populationAge30 = populationAge30;
	}

	public int getPopulationAge31() {
		return populationAge31;
	}

	public void setPopulationAge31(int populationAge31) {
		this.populationAge31 = populationAge31;
	}

	public int getPopulationAge32() {
		return populationAge32;
	}

	public void setPopulationAge32(int populationAge32) {
		this.populationAge32 = populationAge32;
	}

	public int getPopulationAge33() {
		return populationAge33;
	}

	public void setPopulationAge33(int populationAge33) {
		this.populationAge33 = populationAge33;
	}

	public int getPopulationAge34() {
		return populationAge34;
	}

	public void setPopulationAge34(int populationAge34) {
		this.populationAge34 = populationAge34;
	}

	public int getPopulationAge35() {
		return populationAge35;
	}

	public void setPopulationAge35(int populationAge35) {
		this.populationAge35 = populationAge35;
	}

	public int getPopulationAge36() {
		return populationAge36;
	}

	public void setPopulationAge36(int populationAge36) {
		this.populationAge36 = populationAge36;
	}

	public int getPopulationAge37() {
		return populationAge37;
	}

	public void setPopulationAge37(int populationAge37) {
		this.populationAge37 = populationAge37;
	}

	public int getPopulationAge38() {
		return populationAge38;
	}

	public void setPopulationAge38(int populationAge38) {
		this.populationAge38 = populationAge38;
	}

	public int getPopulationAge39() {
		return populationAge39;
	}

	public void setPopulationAge39(int populationAge39) {
		this.populationAge39 = populationAge39;
	}

	public int getPopulationAge40() {
		return populationAge40;
	}

	public void setPopulationAge40(int populationAge40) {
		this.populationAge40 = populationAge40;
	}

	public int getPopulationAge41() {
		return populationAge41;
	}

	public void setPopulationAge41(int populationAge41) {
		this.populationAge41 = populationAge41;
	}

	public int getPopulationAge42() {
		return populationAge42;
	}

	public void setPopulationAge42(int populationAge42) {
		this.populationAge42 = populationAge42;
	}

	public int getPopulationAge43() {
		return populationAge43;
	}

	public void setPopulationAge43(int populationAge43) {
		this.populationAge43 = populationAge43;
	}

	public int getPopulationAge44() {
		return populationAge44;
	}

	public void setPopulationAge44(int populationAge44) {
		this.populationAge44 = populationAge44;
	}

	public int getPopulationAge45() {
		return populationAge45;
	}

	public void setPopulationAge45(int populationAge45) {
		this.populationAge45 = populationAge45;
	}

	public int getPopulationAge46() {
		return populationAge46;
	}

	public void setPopulationAge46(int populationAge46) {
		this.populationAge46 = populationAge46;
	}

	public int getPopulationAge47() {
		return populationAge47;
	}

	public void setPopulationAge47(int populationAge47) {
		this.populationAge47 = populationAge47;
	}

	public int getPopulationAge48() {
		return populationAge48;
	}

	public void setPopulationAge48(int populationAge48) {
		this.populationAge48 = populationAge48;
	}

	public int getPopulationAge49() {
		return populationAge49;
	}

	public void setPopulationAge49(int populationAge49) {
		this.populationAge49 = populationAge49;
	}

	public int getPopulationAge50() {
		return populationAge50;
	}

	public void setPopulationAge50(int populationAge50) {
		this.populationAge50 = populationAge50;
	}

	public int getPopulationAge51() {
		return populationAge51;
	}

	public void setPopulationAge51(int populationAge51) {
		this.populationAge51 = populationAge51;
	}

	public int getPopulationAge52() {
		return populationAge52;
	}

	public void setPopulationAge52(int populationAge52) {
		this.populationAge52 = populationAge52;
	}

	public int getPopulationAge53() {
		return populationAge53;
	}

	public void setPopulationAge53(int populationAge53) {
		this.populationAge53 = populationAge53;
	}

	public int getPopulationAge54() {
		return populationAge54;
	}

	public void setPopulationAge54(int populationAge54) {
		this.populationAge54 = populationAge54;
	}

	public int getPopulationAge55() {
		return populationAge55;
	}

	public void setPopulationAge55(int populationAge55) {
		this.populationAge55 = populationAge55;
	}

	public int getPopulationAge56() {
		return populationAge56;
	}

	public void setPopulationAge56(int populationAge56) {
		this.populationAge56 = populationAge56;
	}

	public int getPopulationAge57() {
		return populationAge57;
	}

	public void setPopulationAge57(int populationAge57) {
		this.populationAge57 = populationAge57;
	}

	public int getPopulationAge58() {
		return populationAge58;
	}

	public void setPopulationAge58(int populationAge58) {
		this.populationAge58 = populationAge58;
	}

	public int getPopulationAge59() {
		return populationAge59;
	}

	public void setPopulationAge59(int populationAge59) {
		this.populationAge59 = populationAge59;
	}

	public int getPopulationAge60() {
		return populationAge60;
	}

	public void setPopulationAge60(int populationAge60) {
		this.populationAge60 = populationAge60;
	}

	public int getPopulationAge61() {
		return populationAge61;
	}

	public void setPopulationAge61(int populationAge61) {
		this.populationAge61 = populationAge61;
	}

	public int getPopulationAge62() {
		return populationAge62;
	}

	public void setPopulationAge62(int populationAge62) {
		this.populationAge62 = populationAge62;
	}

	public int getPopulationAge63() {
		return populationAge63;
	}

	public void setPopulationAge63(int populationAge63) {
		this.populationAge63 = populationAge63;
	}

	public int getPopulationAge64() {
		return populationAge64;
	}

	public void setPopulationAge64(int populationAge64) {
		this.populationAge64 = populationAge64;
	}

	public int getPopulationAge65() {
		return populationAge65;
	}

	public void setPopulationAge65(int populationAge65) {
		this.populationAge65 = populationAge65;
	}

	public int getPopulationAge66() {
		return populationAge66;
	}

	public void setPopulationAge66(int populationAge66) {
		this.populationAge66 = populationAge66;
	}

	public int getPopulationAge67() {
		return populationAge67;
	}

	public void setPopulationAge67(int populationAge67) {
		this.populationAge67 = populationAge67;
	}

	public int getPopulationAge68() {
		return populationAge68;
	}

	public void setPopulationAge68(int populationAge68) {
		this.populationAge68 = populationAge68;
	}

	public int getPopulationAge69() {
		return populationAge69;
	}

	public void setPopulationAge69(int populationAge69) {
		this.populationAge69 = populationAge69;
	}

	public int getPopulationAge70() {
		return populationAge70;
	}

	public void setPopulationAge70(int populationAge70) {
		this.populationAge70 = populationAge70;
	}

	public int getPopulationAge71() {
		return populationAge71;
	}

	public void setPopulationAge71(int populationAge71) {
		this.populationAge71 = populationAge71;
	}

	public int getPopulationAge72() {
		return populationAge72;
	}

	public void setPopulationAge72(int populationAge72) {
		this.populationAge72 = populationAge72;
	}

	public int getPopulationAge73() {
		return populationAge73;
	}

	public void setPopulationAge73(int populationAge73) {
		this.populationAge73 = populationAge73;
	}

	public int getPopulationAge74() {
		return populationAge74;
	}

	public void setPopulationAge74(int populationAge74) {
		this.populationAge74 = populationAge74;
	}

	public int getPopulationAge75() {
		return populationAge75;
	}

	public void setPopulationAge75(int populationAge75) {
		this.populationAge75 = populationAge75;
	}

	public int getPopulationAge76() {
		return populationAge76;
	}

	public void setPopulationAge76(int populationAge76) {
		this.populationAge76 = populationAge76;
	}

	public int getPopulationAge77() {
		return populationAge77;
	}

	public void setPopulationAge77(int populationAge77) {
		this.populationAge77 = populationAge77;
	}

	public int getPopulationAge78() {
		return populationAge78;
	}

	public void setPopulationAge78(int populationAge78) {
		this.populationAge78 = populationAge78;
	}

	public int getPopulationAge79() {
		return populationAge79;
	}

	public void setPopulationAge79(int populationAge79) {
		this.populationAge79 = populationAge79;
	}

	public int getPopulationAge80() {
		return populationAge80;
	}

	public void setPopulationAge80(int populationAge80) {
		this.populationAge80 = populationAge80;
	}

	public int getPopulationAge81() {
		return populationAge81;
	}

	public void setPopulationAge81(int populationAge81) {
		this.populationAge81 = populationAge81;
	}

	public int getPopulationAge82() {
		return populationAge82;
	}

	public void setPopulationAge82(int populationAge82) {
		this.populationAge82 = populationAge82;
	}

	public int getPopulationAge83() {
		return populationAge83;
	}

	public void setPopulationAge83(int populationAge83) {
		this.populationAge83 = populationAge83;
	}

	public int getPopulationAge84() {
		return populationAge84;
	}

	public void setPopulationAge84(int populationAge84) {
		this.populationAge84 = populationAge84;
	}

	public int getPopulationAge85() {
		return populationAge85;
	}

	public void setPopulationAge85(int populationAge85) {
		this.populationAge85 = populationAge85;
	}

	public int getPopulationAge86() {
		return populationAge86;
	}

	public void setPopulationAge86(int populationAge86) {
		this.populationAge86 = populationAge86;
	}

	public int getPopulationAge87() {
		return populationAge87;
	}

	public void setPopulationAge87(int populationAge87) {
		this.populationAge87 = populationAge87;
	}

	public int getPopulationAge88() {
		return populationAge88;
	}

	public void setPopulationAge88(int populationAge88) {
		this.populationAge88 = populationAge88;
	}

	public int getPopulationAge89() {
		return populationAge89;
	}

	public void setPopulationAge89(int populationAge89) {
		this.populationAge89 = populationAge89;
	}

	public int getPopulationAge90() {
		return populationAge90;
	}

	public void setPopulationAge90(int populationAge90) {
		this.populationAge90 = populationAge90;
	}

	public int getPopulationAge91() {
		return populationAge91;
	}

	public void setPopulationAge91(int populationAge91) {
		this.populationAge91 = populationAge91;
	}

	public int getPopulationAge92() {
		return populationAge92;
	}

	public void setPopulationAge92(int populationAge92) {
		this.populationAge92 = populationAge92;
	}

	public int getPopulationAge93() {
		return populationAge93;
	}

	public void setPopulationAge93(int populationAge93) {
		this.populationAge93 = populationAge93;
	}

	public int getPopulationAge94() {
		return populationAge94;
	}

	public void setPopulationAge94(int populationAge94) {
		this.populationAge94 = populationAge94;
	}

	public int getPopulationAge95() {
		return populationAge95;
	}

	public void setPopulationAge95(int populationAge95) {
		this.populationAge95 = populationAge95;
	}

	public int getPopulationAge96() {
		return populationAge96;
	}

	public void setPopulationAge96(int populationAge96) {
		this.populationAge96 = populationAge96;
	}

	public int getPopulationAge97() {
		return populationAge97;
	}

	public void setPopulationAge97(int populationAge97) {
		this.populationAge97 = populationAge97;
	}

	public int getPopulationAge98() {
		return populationAge98;
	}

	public void setPopulationAge98(int populationAge98) {
		this.populationAge98 = populationAge98;
	}

	public int getPopulationAge99() {
		return populationAge99;
	}

	public void setPopulationAge99(int populationAge99) {
		this.populationAge99 = populationAge99;
	}

	public int getPopulationAge100() {
		return populationAge100;
	}

	public void setPopulationAge100(int populationAge100) {
		this.populationAge100 = populationAge100;
	}
	
}

