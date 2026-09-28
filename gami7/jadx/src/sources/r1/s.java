package r1;

import J2.B;
import J2.InterfaceC0310g;
import J2.InterfaceC0328z;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.AbstractC1070a;
import q2.C1074e;
import q2.InterfaceC1073d;
import q2.InterfaceC1075f;
import q2.InterfaceC1076g;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class s extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9998l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9999m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f10000n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0310g f10001o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f10002p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, InterfaceC0310g interfaceC0310g, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f10000n = rVar;
        this.f10001o = interfaceC0310g;
        this.f10002p = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((s) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        s sVar = new s(this.f10000n, this.f10001o, this.f10002p, interfaceC1073d);
        sVar.f9999m = obj;
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        InterfaceC1073d interfaceC1073d;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9998l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC1076g s3 = ((InterfaceC0328z) this.f9999m).r().s(C1074e.f9782h);
            z2.h.c(s3);
            InterfaceC1075f interfaceC1075f = (InterfaceC1075f) s3;
            y yVar = new y(interfaceC1075f);
            InterfaceC1078i A3 = AbstractC0948C.n((AbstractC1070a) interfaceC1075f, yVar).A(new O2.y(Integer.valueOf(System.identityHashCode(yVar)), this.f10000n.f9995j));
            InterfaceC0310g interfaceC0310g = this.f10001o;
            this.f9999m = interfaceC0310g;
            this.f9998l = 1;
            obj = B.z(A3, this.f10002p, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
            interfaceC1073d = interfaceC0310g;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1073d = (InterfaceC1073d) this.f9999m;
            C1.y.J(obj);
        }
        interfaceC1073d.t(obj);
        return C0880v.f8657a;
    }
}
