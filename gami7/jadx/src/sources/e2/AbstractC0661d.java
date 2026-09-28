package e2;

import H.AbstractC0107g0;
import H.C0093e0;
import I.AbstractC0237b;
import J.X0;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0661d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0093e0 f7583a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0093e0 f7584b;

    static {
        long j3 = AbstractC0658a.f7570j;
        long j4 = AbstractC0658a.f7571k;
        long j5 = AbstractC0658a.f7572l;
        long j6 = AbstractC0658a.f7573m;
        long j7 = AbstractC0658a.f7574n;
        long j8 = AbstractC0658a.f7575o;
        long j9 = AbstractC0658a.f7565e;
        X0 x02 = AbstractC0107g0.f2597a;
        f7583a = new C0093e0(j3, AbstractC0237b.f3583h, AbstractC0237b.f3591p, AbstractC0237b.f3584i, AbstractC0237b.f3578c, j4, AbstractC0237b.f3585j, AbstractC0237b.f3592r, AbstractC0237b.f3586k, AbstractC0237b.f3574A, AbstractC0237b.f3587l, AbstractC0237b.f3575B, AbstractC0237b.f3588m, j5, AbstractC0237b.f3580e, j6, j7, AbstractC0237b.f3600z, j8, j3, AbstractC0237b.f3579d, AbstractC0237b.f3577b, j9, AbstractC0237b.f3581f, AbstractC0237b.f3576a, AbstractC0237b.f3582g, AbstractC0237b.f3589n, AbstractC0237b.f3590o, AbstractC0237b.q, AbstractC0237b.f3593s, AbstractC0237b.f3599y, AbstractC0237b.f3594t, AbstractC0237b.f3595u, AbstractC0237b.f3596v, AbstractC0237b.f3597w, AbstractC0237b.f3598x);
        f7584b = AbstractC0107g0.e(AbstractC0658a.f7561a, AbstractC0658a.f7562b, AbstractC0658a.f7566f, AbstractC0658a.f7567g, AbstractC0658a.f7568h, AbstractC0658a.f7569i, j9, -4562978);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if ((r15 & 1) != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r11, final y2.e r12, J.C0285q r13, final int r14, final int r15) {
        /*
            r0 = 1487967999(0x58b096ff, float:1.5533006E15)
            r13.W(r0)
            r0 = r14 & 14
            if (r0 != 0) goto L19
            r0 = r15 & 1
            if (r0 != 0) goto L16
            boolean r0 = r13.h(r11)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r0 | r14
            goto L1a
        L19:
            r0 = r14
        L1a:
            r1 = r15 & 2
            r2 = 32
            if (r1 == 0) goto L23
            r0 = r0 | 48
            goto L32
        L23:
            r1 = r14 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L32
            boolean r1 = r13.i(r12)
            if (r1 == 0) goto L2f
            r1 = r2
            goto L31
        L2f:
            r1 = 16
        L31:
            r0 = r0 | r1
        L32:
            r1 = r0 & 91
            r3 = 18
            if (r1 != r3) goto L44
            boolean r1 = r13.A()
            if (r1 != 0) goto L3f
            goto L44
        L3f:
            r13.P()
            goto Laa
        L44:
            r13.R()
            r1 = r14 & 1
            r3 = 0
            if (r1 == 0) goto L5d
            boolean r1 = r13.z()
            if (r1 == 0) goto L53
            goto L5d
        L53:
            r13.P()
            r1 = r15 & 1
            if (r1 == 0) goto L73
        L5a:
            r0 = r0 & (-15)
            goto L73
        L5d:
            r1 = r15 & 1
            if (r1 == 0) goto L73
            J.B r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f6780a
            java.lang.Object r11 = r13.l(r11)
            android.content.res.Configuration r11 = (android.content.res.Configuration) r11
            int r11 = r11.uiMode
            r11 = r11 & 48
            if (r11 != r2) goto L71
            r11 = 1
            goto L5a
        L71:
            r11 = r3
            goto L5a
        L73:
            r13.s()
            if (r11 == 0) goto L7c
            H.e0 r1 = e2.AbstractC0661d.f7583a
        L7a:
            r4 = r1
            goto L7f
        L7c:
            H.e0 r1 = e2.AbstractC0661d.f7584b
            goto L7a
        L7f:
            J.X0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f6785f
            java.lang.Object r1 = r13.l(r1)
            android.view.View r1 = (android.view.View) r1
            r2 = -707038681(0xffffffffd5db7227, float:-3.0160416E13)
            r13.U(r2)
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L9b
            e2.b r2 = new e2.b
            r2.<init>()
            J.C0257c.g(r2, r13)
        L9b:
            r13.r(r3)
            int r0 = r0 << 6
            r9 = r0 & 7168(0x1c00, float:1.0045E-41)
            r5 = 0
            r6 = 0
            r10 = 6
            r7 = r12
            r8 = r13
            H.D1.f(r4, r5, r6, r7, r8, r9, r10)
        Laa:
            J.t0 r13 = r13.t()
            if (r13 == 0) goto Lb7
            e2.c r0 = new e2.c
            r0.<init>()
            r13.f4235d = r0
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.AbstractC0661d.a(boolean, y2.e, J.q, int, int):void");
    }
}
