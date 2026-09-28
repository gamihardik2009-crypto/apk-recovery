package G;

import J.C0257c;
import J.C0274k0;
import J.W;
import J2.C0317n;
import m.AbstractC0831e;
import m.C0829d;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public b0.c f1175a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1176b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1177c;

    /* renamed from: d, reason: collision with root package name */
    public Float f1178d;

    /* renamed from: e, reason: collision with root package name */
    public Float f1179e;

    /* renamed from: f, reason: collision with root package name */
    public b0.c f1180f;

    /* renamed from: g, reason: collision with root package name */
    public final C0829d f1181g = AbstractC0831e.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public final C0829d f1182h = AbstractC0831e.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public final C0829d f1183i = AbstractC0831e.a(0.0f);

    /* renamed from: j, reason: collision with root package name */
    public final C0317n f1184j;

    /* renamed from: k, reason: collision with root package name */
    public final C0274k0 f1185k;

    /* renamed from: l, reason: collision with root package name */
    public final C0274k0 f1186l;

    public o(b0.c cVar, float f3, boolean z3) {
        this.f1175a = cVar;
        this.f1176b = f3;
        this.f1177c = z3;
        C0317n c0317n = new C0317n(true);
        c0317n.Y(null);
        this.f1184j = c0317n;
        Boolean bool = Boolean.FALSE;
        W w2 = W.f4109m;
        this.f1185k = C0257c.N(bool, w2);
        this.f1186l = C0257c.N(bool, w2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q2.InterfaceC1073d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof G.h
            if (r0 == 0) goto L13
            r0 = r11
            G.h r0 = (G.h) r0
            int r1 = r0.f1162n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1162n = r1
            goto L18
        L13:
            G.h r0 = new G.h
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f1160l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f1162n
            m2.v r3 = m2.C0880v.f8657a
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L40
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            C1.y.J(r11)
            goto Lc5
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            G.o r2 = r0.f1159k
            C1.y.J(r11)
            goto Lae
        L40:
            G.o r2 = r0.f1159k
            C1.y.J(r11)
            goto L5e
        L46:
            C1.y.J(r11)
            r0.f1159k = r10
            r0.f1162n = r7
            G.l r11 = new G.l
            r11.<init>(r10, r6)
            java.lang.Object r11 = J2.B.e(r11, r0)
            if (r11 != r1) goto L59
            goto L5a
        L59:
            r11 = r3
        L5a:
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r2 = r10
        L5e:
            J.k0 r11 = r2.f1185k
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r11.setValue(r8)
            r0.f1159k = r2
            r0.f1162n = r5
        L69:
            J2.n r11 = r2.f1184j
            java.lang.Object r5 = r11.V()
            boolean r8 = r5 instanceof J2.V
            if (r8 != 0) goto L81
            boolean r11 = r5 instanceof J2.C0319p
            if (r11 != 0) goto L7c
            java.lang.Object r11 = J2.B.x(r5)
            goto Lab
        L7c:
            J2.p r5 = (J2.C0319p) r5
            java.lang.Throwable r11 = r5.f4422a
            throw r11
        L81:
            int r5 = r11.h0(r5)
            if (r5 < 0) goto L69
            J2.e0 r5 = new J2.e0
            q2.d r8 = n2.AbstractC0948C.i(r0)
            r5.<init>(r8, r11)
            r5.r()
            J2.Y r8 = new J2.Y
            r9 = 1
            r8.<init>(r9, r5)
            r9 = 0
            J2.J r11 = r11.o(r9, r7, r8)
            J2.e r7 = new J2.e
            r8 = 1
            r7.<init>(r8, r11)
            r5.u(r7)
            java.lang.Object r11 = r5.q()
        Lab:
            if (r11 != r1) goto Lae
            return r1
        Lae:
            r0.f1159k = r6
            r0.f1162n = r4
            r2.getClass()
            G.n r11 = new G.n
            r11.<init>(r2, r6)
            java.lang.Object r11 = J2.B.e(r11, r0)
            if (r11 != r1) goto Lc1
            goto Lc2
        Lc1:
            r11 = r3
        Lc2:
            if (r11 != r1) goto Lc5
            return r1
        Lc5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: G.o.a(q2.d):java.lang.Object");
    }
}
