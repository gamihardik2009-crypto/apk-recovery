package H;

import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r.C1081a;
import r.C1082b;
import r.C1083c;
import r.C1084d;
import r.C1085e;

/* loaded from: classes.dex */
public final class B implements InterfaceC0344h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1313h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.r f1314i;

    public /* synthetic */ B(T.r rVar, int i2) {
        this.f1313h = i2;
        this.f1314i = rVar;
    }

    @Override // M2.InterfaceC0344h
    public final Object f(Object obj, InterfaceC1073d interfaceC1073d) {
        switch (this.f1313h) {
            case 0:
                r.j jVar = (r.j) obj;
                boolean z3 = jVar instanceof r.h;
                T.r rVar = this.f1314i;
                if (z3) {
                    rVar.add(jVar);
                } else if (jVar instanceof r.i) {
                    rVar.remove(((r.i) jVar).f9796a);
                } else if (jVar instanceof C1084d) {
                    rVar.add(jVar);
                } else if (jVar instanceof C1085e) {
                    rVar.remove(((C1085e) jVar).f9789a);
                } else if (jVar instanceof r.n) {
                    rVar.add(jVar);
                } else if (jVar instanceof r.o) {
                    rVar.remove(((r.o) jVar).f9800a);
                } else if (jVar instanceof r.m) {
                    rVar.remove(((r.m) jVar).f9798a);
                }
                break;
            case 1:
                r.j jVar2 = (r.j) obj;
                boolean z4 = jVar2 instanceof r.h;
                T.r rVar2 = this.f1314i;
                if (z4) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof r.i) {
                    rVar2.remove(((r.i) jVar2).f9796a);
                } else if (jVar2 instanceof C1084d) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof C1085e) {
                    rVar2.remove(((C1085e) jVar2).f9789a);
                } else if (jVar2 instanceof r.n) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof r.o) {
                    rVar2.remove(((r.o) jVar2).f9800a);
                } else if (jVar2 instanceof r.m) {
                    rVar2.remove(((r.m) jVar2).f9798a);
                } else if (jVar2 instanceof C1082b) {
                    rVar2.add(jVar2);
                } else if (jVar2 instanceof C1083c) {
                    rVar2.remove(((C1083c) jVar2).f9788a);
                } else if (jVar2 instanceof C1081a) {
                    rVar2.remove(((C1081a) jVar2).f9787a);
                }
                break;
            default:
                r.j jVar3 = (r.j) obj;
                boolean z5 = jVar3 instanceof r.n;
                T.r rVar3 = this.f1314i;
                if (z5) {
                    rVar3.add(jVar3);
                } else if (jVar3 instanceof r.o) {
                    rVar3.remove(((r.o) jVar3).f9800a);
                } else if (jVar3 instanceof r.m) {
                    rVar3.remove(((r.m) jVar3).f9798a);
                } else if (jVar3 instanceof C1082b) {
                    rVar3.add(jVar3);
                } else if (jVar3 instanceof C1083c) {
                    rVar3.remove(((C1083c) jVar3).f9788a);
                } else if (jVar3 instanceof C1081a) {
                    rVar3.remove(((C1081a) jVar3).f9787a);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
