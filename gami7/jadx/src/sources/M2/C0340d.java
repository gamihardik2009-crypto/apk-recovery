package M2;

import J2.InterfaceC0328z;
import N2.AbstractC0368g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m2.C0880v;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* renamed from: M2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340d extends AbstractC0368g {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4871m = AtomicIntegerFieldUpdater.newUpdater(C0340d.class, "consumed");
    private volatile int consumed;

    /* renamed from: k, reason: collision with root package name */
    public final L2.w f4872k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4873l;

    public /* synthetic */ C0340d(L2.w wVar, boolean z3) {
        this(wVar, z3, C1079j.f9784h, -3, 1);
    }

    @Override // N2.AbstractC0368g, M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        C0880v c0880v = C0880v.f8657a;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        if (this.f5044i != -3) {
            Object b3 = super.b(interfaceC0344h, interfaceC1073d);
            return b3 == enumC1145a ? b3 : c0880v;
        }
        boolean z3 = this.f4873l;
        if (z3 && f4871m.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object h2 = P.h(interfaceC0344h, this.f4872k, z3, interfaceC1073d);
        return h2 == enumC1145a ? h2 : c0880v;
    }

    @Override // N2.AbstractC0368g
    public final String e() {
        return "channel=" + this.f4872k;
    }

    @Override // N2.AbstractC0368g
    public final Object f(L2.u uVar, InterfaceC1073d interfaceC1073d) {
        Object h2 = P.h(new N2.D(uVar), this.f4872k, this.f4873l, interfaceC1073d);
        return h2 == EnumC1145a.f10026h ? h2 : C0880v.f8657a;
    }

    @Override // N2.AbstractC0368g
    public final AbstractC0368g g(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return new C0340d(this.f4872k, this.f4873l, interfaceC1078i, i2, i3);
    }

    @Override // N2.AbstractC0368g
    public final InterfaceC0343g h() {
        return new C0340d(this.f4872k, this.f4873l);
    }

    @Override // N2.AbstractC0368g
    public final L2.w i(InterfaceC0328z interfaceC0328z) {
        if (!this.f4873l || f4871m.getAndSet(this, 1) == 0) {
            return this.f5044i == -3 ? this.f4872k : super.i(interfaceC0328z);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public C0340d(L2.w wVar, boolean z3, InterfaceC1078i interfaceC1078i, int i2, int i3) {
        super(interfaceC1078i, i2, i3);
        this.f4872k = wVar;
        this.f4873l = z3;
        this.consumed = 0;
    }
}
