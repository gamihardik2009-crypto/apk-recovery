package u0;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: u0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1311t0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public L2.w f11148l;

    /* renamed from: m, reason: collision with root package name */
    public L2.a f11149m;

    /* renamed from: n, reason: collision with root package name */
    public int f11150n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ L2.k f11151o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1311t0(L2.k kVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11151o = kVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1311t0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1311t0(this.f11151o, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: all -> 0x0011, TryCatch #1 {all -> 0x0011, blocks: (B:6:0x000d, B:7:0x0032, B:9:0x003a, B:10:0x0048, B:17:0x005f, B:19:0x0025, B:23:0x0062, B:26:0x0066, B:27:0x0067, B:34:0x0020, B:12:0x0049, B:14:0x0055), top: B:2:0x0005, inners: #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x002f -> B:7:0x0032). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r6.f11150n
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            L2.a r1 = r6.f11149m
            L2.w r3 = r6.f11148l
            C1.y.J(r7)     // Catch: java.lang.Throwable -> L11
            goto L32
        L11:
            r7 = move-exception
            goto L6f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            C1.y.J(r7)
            L2.k r3 = r6.f11151o
            L2.a r7 = r3.iterator()     // Catch: java.lang.Throwable -> L11
            r1 = r7
        L25:
            r6.f11148l = r3     // Catch: java.lang.Throwable -> L11
            r6.f11149m = r1     // Catch: java.lang.Throwable -> L11
            r6.f11150n = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r1.b(r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L11
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r7 == 0) goto L68
            java.lang.Object r7 = r1.c()     // Catch: java.lang.Throwable -> L11
            m2.v r7 = (m2.C0880v) r7     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r7 = u0.AbstractC1313u0.f11157b     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r7.set(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = T.n.f5710b     // Catch: java.lang.Throwable -> L11
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicReference r5 = T.n.f5717i     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L5d
            T.b r5 = (T.C0374b) r5     // Catch: java.lang.Throwable -> L5d
            j.B r5 = r5.f5673h     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L5f
            boolean r5 = r5.h()     // Catch: java.lang.Throwable -> L5d
            if (r5 != r2) goto L5f
            r4 = r2
            goto L5f
        L5d:
            r0 = move-exception
            goto L66
        L5f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L25
            T.n.a()     // Catch: java.lang.Throwable -> L11
            goto L25
        L66:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L68:
            r7 = 0
            C1.y.k(r3, r7)
            m2.v r7 = m2.C0880v.f8657a
            return r7
        L6f:
            throw r7     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            C1.y.k(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1311t0.p(java.lang.Object):java.lang.Object");
    }
}
