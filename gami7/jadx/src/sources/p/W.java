package p;

import m2.C0880v;
import n0.C0918A;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class W extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f9513j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9514k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078i f9515l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f9516m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(InterfaceC1078i interfaceC1078i, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9515l = interfaceC1078i;
        this.f9516m = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((W) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        W w2 = new W(this.f9515l, this.f9516m, interfaceC1073d);
        w2.f9514k = obj;
        return w2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, n0.A] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r8.f9513j
            q2.i r2 = r8.f9515l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r1 = r8.f9514k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f9514k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r9 = r1
            goto L3b
        L2a:
            r9 = move-exception
            goto L5e
        L2c:
            java.lang.Object r1 = r8.f9514k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L4f
        L34:
            C1.y.J(r9)
            java.lang.Object r9 = r8.f9514k
            n0.A r9 = (n0.C0918A) r9
        L3b:
            boolean r1 = J2.B.p(r2)
            if (r1 == 0) goto L70
            y2.e r1 = r8.f9516m     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f9514k = r9     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f9513j = r5     // Catch: java.util.concurrent.CancellationException -> L5a
            java.lang.Object r1 = r1.j(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5a
            if (r1 != r0) goto L4e
            return r0
        L4e:
            r1 = r9
        L4f:
            r8.f9514k = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r8.f9513j = r4     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r9 = n2.AbstractC0946A.d(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r9 != r0) goto L28
            return r0
        L5a:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L5e:
            boolean r6 = J2.B.p(r2)
            if (r6 == 0) goto L6f
            r8.f9514k = r1
            r8.f9513j = r3
            java.lang.Object r9 = n2.AbstractC0946A.d(r1, r8)
            if (r9 != r0) goto L28
            return r0
        L6f:
            throw r9
        L70:
            m2.v r9 = m2.C0880v.f8657a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.W.p(java.lang.Object):java.lang.Object");
    }
}
