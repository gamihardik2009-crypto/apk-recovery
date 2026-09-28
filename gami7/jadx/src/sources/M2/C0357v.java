package M2;

import m2.C0880v;
import m2.InterfaceC0861c;
import n2.AbstractC0949a;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: M2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357v extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4929l;

    /* renamed from: m, reason: collision with root package name */
    public int f4930m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ InterfaceC0344h f4931n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4932o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4933p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0357v(W1.P p3, InterfaceC1073d interfaceC1073d) {
        super(3, interfaceC1073d);
        this.f4929l = 2;
        this.f4933p = p3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        InterfaceC0344h interfaceC0344h = (InterfaceC0344h) obj;
        switch (this.f4929l) {
            case 0:
                C0357v c0357v = new C0357v((y2.e) this.f4933p, (InterfaceC1073d) obj3, 0);
                c0357v.f4931n = interfaceC0344h;
                c0357v.f4932o = obj2;
                return c0357v.p(C0880v.f8657a);
            case 1:
                C0357v c0357v2 = new C0357v((y2.f) this.f4933p, (InterfaceC1073d) obj3, 1);
                c0357v2.f4931n = interfaceC0344h;
                c0357v2.f4932o = (Object[]) obj2;
                return c0357v2.p(C0880v.f8657a);
            default:
                C0357v c0357v3 = new C0357v((W1.P) this.f4933p, (InterfaceC1073d) obj3);
                c0357v3.f4931n = interfaceC0344h;
                c0357v3.f4932o = obj2;
                return c0357v3.p(C0880v.f8657a);
        }
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        InterfaceC0344h interfaceC0344h;
        InterfaceC0344h interfaceC0344h2;
        G1.h i2;
        switch (this.f4929l) {
            case 0:
                EnumC1145a enumC1145a = EnumC1145a.f10026h;
                int i3 = this.f4930m;
                if (i3 == 0) {
                    C1.y.J(obj);
                    interfaceC0344h = this.f4931n;
                    Object obj2 = this.f4932o;
                    this.f4931n = interfaceC0344h;
                    this.f4930m = 1;
                    obj = ((y2.e) this.f4933p).j(obj2, this);
                    if (obj == enumC1145a) {
                        return enumC1145a;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1.y.J(obj);
                        return C0880v.f8657a;
                    }
                    interfaceC0344h = this.f4931n;
                    C1.y.J(obj);
                }
                this.f4931n = null;
                this.f4930m = 2;
                if (interfaceC0344h.f(obj, this) == enumC1145a) {
                    return enumC1145a;
                }
                return C0880v.f8657a;
            case 1:
                EnumC1145a enumC1145a2 = EnumC1145a.f10026h;
                int i4 = this.f4930m;
                if (i4 == 0) {
                    C1.y.J(obj);
                    interfaceC0344h2 = this.f4931n;
                    Object[] objArr = (Object[]) this.f4932o;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.f4931n = interfaceC0344h2;
                    this.f4930m = 1;
                    obj = ((y2.f) this.f4933p).i(obj3, obj4, this);
                    if (obj == enumC1145a2) {
                        return enumC1145a2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1.y.J(obj);
                        return C0880v.f8657a;
                    }
                    interfaceC0344h2 = this.f4931n;
                    C1.y.J(obj);
                }
                this.f4931n = null;
                this.f4930m = 2;
                if (interfaceC0344h2.f(obj, this) == enumC1145a2) {
                    return enumC1145a2;
                }
                return C0880v.f8657a;
            default:
                EnumC1145a enumC1145a3 = EnumC1145a.f10026h;
                int i5 = this.f4930m;
                C0880v c0880v = C0880v.f8657a;
                if (i5 == 0) {
                    C1.y.J(obj);
                    InterfaceC0344h interfaceC0344h3 = this.f4931n;
                    String str = (String) this.f4932o;
                    int length = str.length();
                    W1.P p3 = (W1.P) this.f4933p;
                    if (length == 0) {
                        i2 = p3.f5959b.f5313b;
                    } else {
                        Q1.p pVar = p3.f5959b;
                        pVar.getClass();
                        Q1.e q = pVar.f5312a.q();
                        q.getClass();
                        r1.v a3 = r1.v.a("SELECT * FROM clients WHERE name LIKE '%' || ? || '%' OR phone LIKE '%' || ? || '%' ORDER BY orderIndex ASC", 2);
                        a3.p(str, 1);
                        a3.p(str, 2);
                        Q1.a aVar = new Q1.a(q, a3, 1);
                        i2 = AbstractC0949a.i((r1.r) q.f5277a, false, new String[]{"clients"}, aVar);
                    }
                    this.f4930m = 1;
                    if (interfaceC0344h3 instanceof f0) {
                        throw ((f0) interfaceC0344h3).f4883h;
                    }
                    Object b3 = i2.b(interfaceC0344h3, this);
                    if (b3 != enumC1145a3) {
                        b3 = c0880v;
                    }
                    if (b3 == enumC1145a3) {
                        return enumC1145a3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1.y.J(obj);
                }
                return c0880v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0357v(InterfaceC0861c interfaceC0861c, InterfaceC1073d interfaceC1073d, int i2) {
        super(3, interfaceC1073d);
        this.f4929l = i2;
        this.f4933p = interfaceC0861c;
    }
}
