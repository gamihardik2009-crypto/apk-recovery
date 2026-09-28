package d0;

import C0.E;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f7399a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f7400b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0646q f7401c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0646q f7402d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0646q f7403e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0646q f7404f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0646q f7405g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0646q f7406h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0646q f7407i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0646q f7408j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0646q f7409k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0646q f7410l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0646q f7411m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0646q f7412n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0646q f7413o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0646q f7414p;
    public static final C0640k q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0640k f7415r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0646q f7416s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0641l f7417t;

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC0632c[] f7418u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f7399a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f7400b = fArr2;
        C0647r c0647r = new C0647r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0647r c0647r2 = new C0647r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C0648s c0648s = AbstractC0639j.f7430d;
        C0646q c0646q = new C0646q("sRGB IEC61966-2.1", fArr, c0648s, c0647r, 0);
        f7401c = c0646q;
        C0646q c0646q2 = new C0646q("sRGB IEC61966-2.1 (Linear)", fArr, c0648s, 1.0d, 0.0f, 1.0f, 1);
        f7402d = c0646q2;
        C0646q c0646q3 = new C0646q("scRGB-nl IEC 61966-2-2:2003", fArr, c0648s, null, new E(7), new E(8), -0.799f, 2.399f, c0647r, 2);
        f7403e = c0646q3;
        C0646q c0646q4 = new C0646q("scRGB IEC 61966-2-2:2003", fArr, c0648s, 1.0d, -0.5f, 7.499f, 3);
        f7404f = c0646q4;
        C0646q c0646q5 = new C0646q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c0648s, new C0647r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f7405g = c0646q5;
        C0646q c0646q6 = new C0646q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c0648s, new C0647r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f7406h = c0646q6;
        C0646q c0646q7 = new C0646q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C0648s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f7407i = c0646q7;
        C0646q c0646q8 = new C0646q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c0648s, c0647r, 7);
        f7408j = c0646q8;
        C0646q c0646q9 = new C0646q("NTSC (1953)", fArr2, AbstractC0639j.f7427a, new C0647r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f7409k = c0646q9;
        C0646q c0646q10 = new C0646q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c0648s, new C0647r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f7410l = c0646q10;
        C0646q c0646q11 = new C0646q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c0648s, 2.2d, 0.0f, 1.0f, 10);
        f7411m = c0646q11;
        C0646q c0646q12 = new C0646q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC0639j.f7428b, new C0647r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f7412n = c0646q12;
        C0648s c0648s2 = AbstractC0639j.f7429c;
        C0646q c0646q13 = new C0646q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c0648s2, 1.0d, -65504.0f, 65504.0f, 12);
        f7413o = c0646q13;
        C0646q c0646q14 = new C0646q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c0648s2, 1.0d, -65504.0f, 65504.0f, 13);
        f7414p = c0646q14;
        C0640k c0640k = new C0640k(14, 1, AbstractC0631b.f7392b, "Generic XYZ");
        q = c0640k;
        long j3 = AbstractC0631b.f7393c;
        C0640k c0640k2 = new C0640k(15, 0, j3, "Generic L*a*b*");
        f7415r = c0640k2;
        C0646q c0646q15 = new C0646q("None", fArr, c0648s, c0647r2, 16);
        f7416s = c0646q15;
        C0641l c0641l = new C0641l("Oklab", j3, 17);
        f7417t = c0641l;
        f7418u = new AbstractC0632c[]{c0646q, c0646q2, c0646q3, c0646q4, c0646q5, c0646q6, c0646q7, c0646q8, c0646q9, c0646q10, c0646q11, c0646q12, c0646q13, c0646q14, c0640k, c0640k2, c0646q15, c0641l};
    }
}
