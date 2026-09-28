package M2;

import J2.C0311h;
import N2.AbstractC0363b;
import N2.AbstractC0364c;
import N2.AbstractC0365d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class d0 extends AbstractC0363b implements I, InterfaceC0343g, N2.w {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4874m = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: l, reason: collision with root package name */
    public int f4875l;

    public d0(Object obj) {
        this._state = obj;
    }

    @Override // M2.H
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c8, B:31:0x00e0, B:37:0x00f4, B:33:0x00eb, B:36:0x00f1, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c8, B:31:0x00e0, B:37:0x00f4, B:33:0x00eb, B:36:0x00f1, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c7 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // M2.InterfaceC0343g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(M2.InterfaceC0344h r17, q2.InterfaceC1073d r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.d0.b(M2.h, q2.d):java.lang.Object");
    }

    @Override // N2.w
    public final InterfaceC0343g c(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) ? P.m(this, interfaceC1078i, i2, i3) : this;
    }

    @Override // M2.H
    public final boolean d(Object obj) {
        k(obj);
        return true;
    }

    @Override // M2.InterfaceC0344h
    public final Object f(Object obj, InterfaceC1073d interfaceC1073d) {
        k(obj);
        return C0880v.f8657a;
    }

    @Override // N2.AbstractC0363b
    public final AbstractC0365d g() {
        return new e0();
    }

    @Override // M2.b0
    public final Object getValue() {
        O2.v vVar = AbstractC0364c.f5033b;
        Object obj = f4874m.get(this);
        if (obj == vVar) {
            return null;
        }
        return obj;
    }

    @Override // N2.AbstractC0363b
    public final AbstractC0365d[] h() {
        return new e0[2];
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = AbstractC0364c.f5033b;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i2;
        AbstractC0365d[] abstractC0365dArr;
        O2.v vVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4874m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !z2.h.a(obj3, obj)) {
                return false;
            }
            if (z2.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f4875l;
            if ((i3 & 1) != 0) {
                this.f4875l = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f4875l = i4;
            AbstractC0365d[] abstractC0365dArr2 = this.f5028h;
            while (true) {
                e0[] e0VarArr = (e0[]) abstractC0365dArr2;
                if (e0VarArr != null) {
                    for (e0 e0Var : e0VarArr) {
                        if (e0Var != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e0.f4879a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(e0Var);
                                if (obj4 != null && obj4 != (vVar = P.f4831c)) {
                                    O2.v vVar2 = P.f4830b;
                                    if (obj4 != vVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(e0Var, obj4, vVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(e0Var) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0311h) obj4).t(C0880v.f8657a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(e0Var, obj4, vVar)) {
                                        if (atomicReferenceFieldUpdater2.get(e0Var) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f4875l;
                    if (i2 == i4) {
                        this.f4875l = i4 + 1;
                        return true;
                    }
                    abstractC0365dArr = this.f5028h;
                }
                abstractC0365dArr2 = abstractC0365dArr;
                i4 = i2;
            }
        }
    }
}
