package o;

import m2.C0880v;
import n0.C0918A;
import q2.InterfaceC1073d;
import s2.AbstractC1203h;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979e extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f9188j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9189k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.c f9190l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0979e(y2.c cVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9190l = cVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0979e) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0979e c0979e = new C0979e(this.f9190l, interfaceC1073d);
        c0979e.f9189k = obj;
        return c0979e;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r6.f9188j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            C1.y.J(r7)
            goto L52
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.f9189k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r7)
            goto L33
        L20:
            C1.y.J(r7)
            java.lang.Object r7 = r6.f9189k
            r1 = r7
            n0.A r1 = (n0.C0918A) r1
            r6.f9189k = r1
            r6.f9188j = r3
            java.lang.Object r7 = n2.AbstractC0949a.e(r1, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            n0.r r7 = (n0.r) r7
            r7.a()
            b0.c r3 = new b0.c
            long r4 = r7.f8959c
            r3.<init>(r4)
            y2.c r7 = r6.f9190l
            r7.l(r3)
            r7 = 0
            r6.f9189k = r7
            r6.f9188j = r2
            n0.j r7 = n0.EnumC0931j.f8947i
            java.lang.Object r7 = p.b1.e(r1, r7, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            n0.r r7 = (n0.r) r7
            if (r7 == 0) goto L59
            r7.a()
        L59:
            m2.v r7 = m2.C0880v.f8657a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0979e.p(java.lang.Object):java.lang.Object");
    }
}
