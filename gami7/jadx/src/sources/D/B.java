package D;

import m2.C0880v;
import n0.C0918A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class B extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f713j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f714k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.c f715l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(y2.c cVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f715l = cVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((B) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        B b3 = new B(this.f715l, interfaceC1073d);
        b3.f714k = obj;
        return b3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r5) {
        /*
            r4 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r4.f713j
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f714k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            C1.y.J(r5)
            java.lang.Object r5 = r4.f714k
            n0.A r5 = (n0.C0918A) r5
            r1 = r5
        L21:
            n0.j r5 = n0.EnumC0931j.f8946h
            r4.f714k = r1
            r4.f713j = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            n0.i r5 = (n0.C0930i) r5
            boolean r5 = B1.C.b0(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            y2.c r3 = r4.f715l
            r3.l(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: D.B.p(java.lang.Object):java.lang.Object");
    }
}
