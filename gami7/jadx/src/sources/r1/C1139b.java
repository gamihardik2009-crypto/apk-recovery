package r1;

import J2.InterfaceC0328z;
import java.util.concurrent.Callable;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139b extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public L2.a f9913l;

    /* renamed from: m, reason: collision with root package name */
    public int f9914m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f9915n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ K1.e f9916o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L2.k f9917p;
    public final /* synthetic */ Callable q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L2.k f9918r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139b(r rVar, K1.e eVar, L2.k kVar, Callable callable, L2.k kVar2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9915n = rVar;
        this.f9916o = eVar;
        this.f9917p = kVar;
        this.q = callable;
        this.f9918r = kVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1139b) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1139b(this.f9915n, this.f9916o, this.f9917p, this.q, this.f9918r, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:9:0x0035, B:14:0x0043, B:16:0x004b, B:25:0x0023, B:27:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:8:0x0015). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r8.f9914m
            r2 = 2
            r3 = 1
            K1.e r4 = r8.f9916o
            r1.r r5 = r8.f9915n
            if (r1 == 0) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            L2.a r1 = r8.f9913l
            C1.y.J(r9)     // Catch: java.lang.Throwable -> L17
        L15:
            r9 = r1
            goto L35
        L17:
            r9 = move-exception
            goto L69
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            L2.a r1 = r8.f9913l
            C1.y.J(r9)     // Catch: java.lang.Throwable -> L17
            goto L43
        L27:
            C1.y.J(r9)
            r1.n r9 = r5.f9990e
            r9.a(r4)
            L2.k r9 = r8.f9917p     // Catch: java.lang.Throwable -> L17
            L2.a r9 = r9.iterator()     // Catch: java.lang.Throwable -> L17
        L35:
            r8.f9913l = r9     // Catch: java.lang.Throwable -> L17
            r8.f9914m = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r9.b(r8)     // Catch: java.lang.Throwable -> L17
            if (r1 != r0) goto L40
            return r0
        L40:
            r7 = r1
            r1 = r9
            r9 = r7
        L43:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L17
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r9 == 0) goto L61
            r1.c()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.Callable r9 = r8.q     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L17
            L2.k r6 = r8.f9918r     // Catch: java.lang.Throwable -> L17
            r8.f9913l = r1     // Catch: java.lang.Throwable -> L17
            r8.f9914m = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r6.v(r9, r8)     // Catch: java.lang.Throwable -> L17
            if (r9 != r0) goto L15
            return r0
        L61:
            r1.n r9 = r5.f9990e
            r9.c(r4)
            m2.v r9 = m2.C0880v.f8657a
            return r9
        L69:
            r1.n r0 = r5.f9990e
            r0.c(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C1139b.p(java.lang.Object):java.lang.Object");
    }
}
