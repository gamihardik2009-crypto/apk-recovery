package C0;

import c0.C0603v;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final long f443a = B1.C.X(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f444b = B1.C.X(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f445c = C0603v.f7276f;

    /* renamed from: d, reason: collision with root package name */
    public static final N0.m f446d;

    static {
        long j3 = C0603v.f7272b;
        f446d = j3 != 16 ? new N0.c(j3) : N0.l.f4998a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0065, code lost:
    
        if (r29 != r19.f432f) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0077, code lost:
    
        if (O0.m.a(r31, r19.f434h) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (O0.m.a(r24, r19.f428b) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x004b, code lost:
    
        if (c0.C0603v.c(r20, r19.f427a.b()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0055, code lost:
    
        if (z2.h.a(r27, r19.f430d) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x005f, code lost:
    
        if (z2.h.a(r26, r19.f429c) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final C0.C a(C0.C r19, long r20, c0.AbstractC0598q r22, float r23, long r24, H0.k r26, H0.i r27, H0.j r28, H0.q r29, java.lang.String r30, long r31, N0.a r33, N0.n r34, J0.b r35, long r36, N0.j r38, c0.C0575O r39, C0.w r40, e0.AbstractC0655e r41) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.D.a(C0.C, long, c0.q, float, long, H0.k, H0.i, H0.j, H0.q, java.lang.String, long, N0.a, N0.n, J0.b, long, N0.j, c0.O, C0.w, e0.e):C0.C");
    }

    public static final Object b(Object obj, Object obj2, float f3) {
        return ((double) f3) < 0.5d ? obj : obj2;
    }

    public static final long c(long j3, long j4, float f3) {
        if (B1.C.c0(j3) || B1.C.c0(j4)) {
            return ((O0.m) b(new O0.m(j3), new O0.m(j4), f3)).f5154a;
        }
        if (B1.C.c0(j3) || B1.C.c0(j4)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (O0.n.a(O0.m.b(j3), O0.m.b(j4))) {
            return B1.C.f0(B2.a.y(O0.m.c(j3), O0.m.c(j4), f3), 1095216660480L & j3);
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) O0.n.b(O0.m.b(j3))) + " and " + ((Object) O0.n.b(O0.m.b(j4)))).toString());
    }
}
