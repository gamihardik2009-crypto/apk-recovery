package a2;

import C1.y;
import J2.InterfaceC0328z;
import Q1.p;
import java.util.Iterator;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class h extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public l f6511l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f6512m;

    /* renamed from: n, reason: collision with root package name */
    public int f6513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f6514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6514o = lVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((h) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new h(this.f6514o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        Iterator it;
        l lVar;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6513n;
        l lVar2 = this.f6514o;
        if (i2 == 0) {
            y.J(obj);
            it = ((Iterable) lVar2.f6532h.f4811h.getValue()).iterator();
            lVar = lVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f6512m;
            lVar = this.f6511l;
            y.J(obj);
        }
        while (it.hasNext()) {
            R1.g gVar = (R1.g) it.next();
            p pVar = lVar.f6526b;
            R1.f fVar = gVar.f5506a;
            R1.f a3 = R1.f.a(fVar, null, null, null, R1.c.f5485j, fVar.f5502g + 1, null, 927);
            this.f6511l = lVar;
            this.f6512m = it;
            this.f6513n = 1;
            if (pVar.g(a3, this) == enumC1145a) {
                return enumC1145a;
            }
        }
        lVar2.f6527c.c();
        return C0880v.f8657a;
    }
}
