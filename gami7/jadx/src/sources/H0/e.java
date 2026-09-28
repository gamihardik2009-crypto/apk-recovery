package H0;

import B.F;
import J2.B;
import J2.q0;
import n2.AbstractC0948C;
import q2.C1079j;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final C1.b f3390a;

    /* renamed from: b, reason: collision with root package name */
    public final p f3391b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.m f3392c;

    /* renamed from: d, reason: collision with root package name */
    public final h f3393d;

    /* renamed from: e, reason: collision with root package name */
    public final F f3394e;

    public e(C1.b bVar, a aVar) {
        Q1.m mVar = f.f3395a;
        C1.b bVar2 = f.f3396b;
        C1079j c1079j = C1079j.f9784h;
        h hVar = new h();
        K2.d dVar = K0.h.f4525a;
        g gVar = h.f3397a;
        gVar.getClass();
        B.a(AbstractC0948C.n(gVar, dVar).A(c1079j).A(new q0(null)));
        F f3 = new F(5);
        this.f3390a = bVar;
        this.f3391b = aVar;
        this.f3392c = mVar;
        this.f3393d = hVar;
        this.f3394e = f3;
        new A0.n(6, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: Exception -> 0x0084, TRY_ENTER, TryCatch #2 {Exception -> 0x0084, blocks: (B:15:0x0027, B:18:0x0042, B:19:0x0051, B:33:0x007c, B:34:0x0083, B:36:0x003e, B:38:0x0047, B:40:0x004b), top: B:14:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H0.s a(H0.r r7) {
        /*
            r6 = this;
            Q1.m r0 = r6.f3392c
            java.lang.Object r1 = r0.f5302a
            C1.b r1 = (C1.b) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f5303b     // Catch: java.lang.Throwable -> L24
            G0.b r2 = (G0.b) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L24
            H0.s r2 = (H0.s) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            boolean r3 = r2.f3416i     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L19
            monitor-exit(r1)
            goto L79
        L19:
            java.lang.Object r2 = r0.f5303b     // Catch: java.lang.Throwable -> L24
            G0.b r2 = (G0.b) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.c(r7)     // Catch: java.lang.Throwable -> L24
            H0.s r2 = (H0.s) r2     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r7 = move-exception
            goto L8d
        L26:
            monitor-exit(r1)
            H0.h r1 = r6.f3393d     // Catch: java.lang.Exception -> L84
            r1.getClass()     // Catch: java.lang.Exception -> L84
            B.F r1 = r6.f3394e     // Catch: java.lang.Exception -> L84
            r1.getClass()     // Catch: java.lang.Exception -> L84
            H0.q r2 = r7.f3410a     // Catch: java.lang.Exception -> L84
            java.lang.Object r1 = r1.f165i     // Catch: java.lang.Exception -> L84
            C1.b r1 = (C1.b) r1     // Catch: java.lang.Exception -> L84
            int r3 = r7.f3412c     // Catch: java.lang.Exception -> L84
            H0.k r4 = r7.f3411b     // Catch: java.lang.Exception -> L84
            if (r2 != 0) goto L3e
            goto L42
        L3e:
            boolean r5 = r2 instanceof H0.b     // Catch: java.lang.Exception -> L84
            if (r5 == 0) goto L47
        L42:
            android.graphics.Typeface r1 = r1.f(r4, r3)     // Catch: java.lang.Exception -> L84
            goto L51
        L47:
            boolean r5 = r2 instanceof H0.m     // Catch: java.lang.Exception -> L84
            if (r5 == 0) goto L57
            H0.m r2 = (H0.m) r2     // Catch: java.lang.Exception -> L84
            android.graphics.Typeface r1 = r1.g(r2, r4, r3)     // Catch: java.lang.Exception -> L84
        L51:
            H0.s r2 = new H0.s     // Catch: java.lang.Exception -> L84
            r2.<init>(r1)     // Catch: java.lang.Exception -> L84
            goto L59
        L57:
            r1 = 0
            r2 = r1
        L59:
            if (r2 == 0) goto L7c
            java.lang.Object r1 = r0.f5302a
            C1.b r1 = (C1.b) r1
            monitor-enter(r1)
            java.lang.Object r3 = r0.f5303b     // Catch: java.lang.Throwable -> L76
            G0.b r3 = (G0.b) r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = r3.a(r7)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L78
            boolean r3 = r2.f3416i     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L78
            java.lang.Object r0 = r0.f5303b     // Catch: java.lang.Throwable -> L76
            G0.b r0 = (G0.b) r0     // Catch: java.lang.Throwable -> L76
            r0.b(r7, r2)     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r7 = move-exception
            goto L7a
        L78:
            monitor-exit(r1)
        L79:
            return r2
        L7a:
            monitor-exit(r1)
            throw r7
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L84
            throw r7     // Catch: java.lang.Exception -> L84
        L84:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        L8d:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.a(H0.r):H0.s");
    }

    public final s b(q qVar, k kVar, int i2, int i3) {
        p pVar = this.f3391b;
        pVar.getClass();
        k a3 = pVar.a(kVar);
        this.f3390a.getClass();
        return a(new r(qVar, a3, i2, i3, null));
    }
}
