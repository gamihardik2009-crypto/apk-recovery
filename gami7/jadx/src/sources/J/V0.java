package J;

import i0.C0715h;
import i0.C0716i;
import i0.C0717j;
import i0.C0718k;
import i0.C0719l;
import i0.C0720m;
import i0.C0721n;
import i0.C0722o;
import i0.C0723p;
import i0.C0724q;
import i0.C0725r;
import i0.C0726s;
import java.util.ArrayList;
import java.util.Iterator;
import m.AbstractC0845s;
import m.C0820D;
import m.InterfaceC0818B;
import m.InterfaceC0846t;
import n2.AbstractC0964p;
import n2.AbstractC0974z;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC0846t {

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4104h;

    public V0(int i2) {
        switch (i2) {
            case 1:
                this.f4104h = new ArrayList(32);
                break;
            default:
                this.f4104h = new ArrayList();
                break;
        }
    }

    public void a() {
        this.f4104h.add(C0715h.f7902b);
    }

    public void b(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f4104h.add(new C0716i(f3, f4, f5, f6, f7, f8));
    }

    public void c(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f4104h.add(new C0721n(f3, f4, f5, f6, f7, f8));
    }

    public void d(float f3) {
        this.f4104h.add(new C0717j(f3));
    }

    public void e(float f3) {
        this.f4104h.add(new C0722o(f3));
    }

    public void f(float f3, float f4) {
        this.f4104h.add(new C0718k(f3, f4));
    }

    public void g(float f3, float f4) {
        this.f4104h.add(new C0723p(f3, f4));
    }

    @Override // m.InterfaceC0846t
    public InterfaceC0818B get(int i2) {
        return (C0820D) this.f4104h.get(i2);
    }

    public void h(float f3, float f4) {
        this.f4104h.add(new C0719l(f3, f4));
    }

    public void i(float f3, float f4, float f5, float f6) {
        this.f4104h.add(new C0720m(f3, f4, f5, f6));
    }

    public void j(float f3, float f4, float f5, float f6) {
        this.f4104h.add(new C0724q(f3, f4, f5, f6));
    }

    public void k(float f3) {
        this.f4104h.add(new C0726s(f3));
    }

    public void l(float f3) {
        this.f4104h.add(new C0725r(f3));
    }

    public V0(float f3, float f4, AbstractC0845s abstractC0845s) {
        E2.d m02 = B1.C.m0(0, abstractC0845s.b());
        ArrayList arrayList = new ArrayList(AbstractC0964p.z(m02, 10));
        Iterator it = m02.iterator();
        while (((E2.c) it).f1081j) {
            arrayList.add(new C0820D(f3, f4, abstractC0845s.a(((AbstractC0974z) it).a())));
        }
        this.f4104h = arrayList;
    }
}
