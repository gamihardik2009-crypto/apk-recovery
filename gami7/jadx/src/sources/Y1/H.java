package Y1;

import M2.K;
import M2.P;
import M2.T;
import M2.d0;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import n2.C0970v;

/* loaded from: classes.dex */
public final class H extends X {

    /* renamed from: b, reason: collision with root package name */
    public final Q1.p f6264b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.a f6265c;

    /* renamed from: d, reason: collision with root package name */
    public final C1.b f6266d;

    /* renamed from: e, reason: collision with root package name */
    public final K f6267e;

    /* renamed from: f, reason: collision with root package name */
    public final K f6268f;

    /* renamed from: g, reason: collision with root package name */
    public final K f6269g;

    /* renamed from: h, reason: collision with root package name */
    public final K f6270h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f6271i;

    /* renamed from: j, reason: collision with root package name */
    public final K f6272j;

    /* renamed from: k, reason: collision with root package name */
    public final K f6273k;

    public H(Q1.p pVar, V1.a aVar) {
        z2.h.f(pVar, "repository");
        this.f6264b = pVar;
        this.f6265c = aVar;
        this.f6266d = new C1.b(12, false);
        this.f6267e = P.n(new A(pVar.f5313b, 0), Q.j(this), T.a(5000L, 2), 0);
        this.f6268f = P.n(new A(pVar.f5314c, 1), Q.j(this), T.a(5000L, 2), 0);
        this.f6269g = P.n(new G1.h(2, new w(this, null)), Q.j(this), T.a(5000L, 2), new o(0, 0, 0, 0, 0.0f));
        this.f6270h = P.n(pVar.f5317f, Q.j(this), T.a(5000L, 2), new R1.a());
        d0 b3 = P.b(Boolean.FALSE);
        this.f6271i = b3;
        this.f6272j = new K(b3);
        this.f6273k = P.n(pVar.f5316e, Q.j(this), T.a(5000L, 2), C0970v.f9165h);
        J2.B.r(Q.j(this), null, 0, new r(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(Y1.H r9, q2.InterfaceC1073d r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof Y1.s
            if (r0 == 0) goto L16
            r0 = r10
            Y1.s r0 = (Y1.s) r0
            int r1 = r0.f6351n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6351n = r1
            goto L1b
        L16:
            Y1.s r0 = new Y1.s
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f6349l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f6351n
            m2.v r3 = m2.C0880v.f8657a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            C1.y.J(r10)
            goto Lb0
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            Y1.H r9 = r0.f6348k
            C1.y.J(r10)
            goto L82
        L3e:
            C1.y.J(r10)
            java.time.LocalDate r10 = java.time.LocalDate.now()
            r6 = 1
            java.time.LocalDate r10 = r10.minusWeeks(r6)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "toString(...)"
            z2.h.e(r10, r2)
            r0.f6348k = r9
            r0.f6351n = r5
            Q1.p r2 = r9.f6264b
            com.example.bulksmsscheduler.data.AppDatabase r2 = r2.f5312a
            Q1.k r2 = r2.r()
            r2.getClass()
            java.lang.String r6 = "SELECT * FROM schedules WHERE scheduledDate < ?"
            r1.v r6 = r1.v.a(r6, r5)
            r6.p(r10, r5)
            android.os.CancellationSignal r10 = new android.os.CancellationSignal
            r10.<init>()
            Q1.h r7 = new Q1.h
            r8 = 6
            r7.<init>(r2, r6, r8)
            java.lang.Object r2 = r2.f5292a
            r1.r r2 = (r1.r) r2
            java.lang.Object r10 = n2.AbstractC0949a.j(r2, r10, r7, r0)
            if (r10 != r1) goto L82
            goto Lb1
        L82:
            java.util.List r10 = (java.util.List) r10
            boolean r2 = r10.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto Lb0
            Q1.p r9 = r9.f6264b
            r2 = 0
            r0.f6348k = r2
            r0.f6351n = r4
            com.example.bulksmsscheduler.data.AppDatabase r9 = r9.f5312a
            Q1.k r9 = r9.r()
            r9.getClass()
            Q1.f r2 = new Q1.f
            r4 = 2
            r2.<init>(r9, r10, r4)
            java.lang.Object r9 = r9.f5292a
            r1.r r9 = (r1.r) r9
            java.lang.Object r9 = n2.AbstractC0949a.k(r9, r2, r0)
            if (r9 != r1) goto Lac
            goto Lad
        Lac:
            r9 = r3
        Lad:
            if (r9 != r1) goto Lb0
            goto Lb1
        Lb0:
            r1 = r3
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.H.e(Y1.H, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01d8 -> B:13:0x01dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01e2 -> B:14:0x01ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(Y1.H r27, R1.a r28, q2.InterfaceC1073d r29) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.H.f(Y1.H, R1.a, q2.d):java.lang.Object");
    }
}
