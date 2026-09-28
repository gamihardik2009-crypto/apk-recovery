package H;

import J.C0257c;
import J.C0285q;
import J.C0291t0;

/* loaded from: classes.dex */
public abstract class t5 {

    /* renamed from: a, reason: collision with root package name */
    public static final J.B f3139a = new J.B(J.W.f4109m, C0100f0.f2571w);

    public static final void a(C0.K k3, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-460300127);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(k3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            J.B b3 = f3139a;
            C0257c.a(b3.a(((C0.K) c0285q.l(b3)).d(k3)), eVar, c0285q, (i3 & 112) | 8);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 2, k3, eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r40, V.o r41, long r42, long r44, H0.i r46, H0.k r47, H0.q r48, long r49, N0.j r51, N0.i r52, long r53, int r55, boolean r56, int r57, int r58, y2.c r59, C0.K r60, J.C0285q r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.t5.b(java.lang.String, V.o, long, long, H0.i, H0.k, H0.q, long, N0.j, N0.i, long, int, boolean, int, int, y2.c, C0.K, J.q, int, int, int):void");
    }
}
