package p;

import H.C0148m;
import m.AbstractC0831e;
import m.InterfaceC0840m;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010c0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9569l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9570m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f9571n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0840m f9572o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z2.p f9573p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1010c0(float f3, InterfaceC0840m interfaceC0840m, z2.p pVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9571n = f3;
        this.f9572o = interfaceC0840m;
        this.f9573p = pVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1010c0) m((InterfaceC1012d0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1010c0 c1010c0 = new C1010c0(this.f9571n, this.f9572o, this.f9573p, interfaceC1073d);
        c1010c0.f9570m = obj;
        return c1010c0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9569l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0148m c0148m = new C0148m(this.f9573p, 16, (InterfaceC1012d0) this.f9570m);
            this.f9569l = 1;
            if (AbstractC0831e.d(0.0f, this.f9571n, this.f9572o, c0148m, this, 4) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return C0880v.f8657a;
    }
}
