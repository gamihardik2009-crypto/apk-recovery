package q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0867i;
import r2.EnumC1145a;
import s2.InterfaceC1199d;

/* renamed from: q2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080k implements InterfaceC1073d, InterfaceC1199d {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9785i = AtomicReferenceFieldUpdater.newUpdater(C1080k.class, Object.class, "result");

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1073d f9786h;
    private volatile Object result;

    public C1080k(InterfaceC1073d interfaceC1073d, EnumC1145a enumC1145a) {
        this.f9786h = interfaceC1073d;
        this.result = enumC1145a;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC1145a enumC1145a = EnumC1145a.f10027i;
        if (obj == enumC1145a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9785i;
            EnumC1145a enumC1145a2 = EnumC1145a.f10026h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1145a, enumC1145a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC1145a) {
                    obj = this.result;
                }
            }
            return EnumC1145a.f10026h;
        }
        if (obj == EnumC1145a.f10028j) {
            return EnumC1145a.f10026h;
        }
        if (obj instanceof C0867i) {
            throw ((C0867i) obj).f8648h;
        }
        return obj;
    }

    @Override // s2.InterfaceC1199d
    public final InterfaceC1199d k() {
        InterfaceC1073d interfaceC1073d = this.f9786h;
        if (interfaceC1073d instanceof InterfaceC1199d) {
            return (InterfaceC1199d) interfaceC1073d;
        }
        return null;
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return this.f9786h.n();
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC1145a enumC1145a = EnumC1145a.f10027i;
            if (obj2 == enumC1145a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9785i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1145a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC1145a) {
                        break;
                    }
                }
                return;
            }
            EnumC1145a enumC1145a2 = EnumC1145a.f10026h;
            if (obj2 != enumC1145a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9785i;
            EnumC1145a enumC1145a3 = EnumC1145a.f10028j;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC1145a2, enumC1145a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC1145a2) {
                    break;
                }
            }
            this.f9786h.t(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f9786h;
    }
}
