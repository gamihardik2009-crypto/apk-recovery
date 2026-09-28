package l;

import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0963o;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.Z;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806o implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final C0809s f8229a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8230b;

    public C0806o(C0809s c0809s) {
        this.f8229a = c0809s;
    }

    @Override // r0.InterfaceC1094H
    public final int a(Z z3, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC1093G) list.get(0)).b(i2));
            int u3 = AbstractC0963o.u(list);
            int i3 = 1;
            if (1 <= u3) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC1093G) list.get(i3)).b(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == u3) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // r0.InterfaceC1094H
    public final int c(Z z3, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC1093G) list.get(0)).L(i2));
            int u3 = AbstractC0963o.u(list);
            int i3 = 1;
            if (1 <= u3) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC1093G) list.get(i3)).L(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == u3) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // r0.InterfaceC1094H
    public final int d(Z z3, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC1093G) list.get(0)).b0(i2));
            int u3 = AbstractC0963o.u(list);
            int i3 = 1;
            if (1 <= u3) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC1093G) list.get(i3)).b0(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == u3) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC1093G) list.get(i2)).a(j3));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i3 = ((AbstractC1103Q) obj).f9834h;
            int u3 = AbstractC0963o.u(arrayList);
            if (1 <= u3) {
                int i4 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i4);
                    int i5 = ((AbstractC1103Q) obj3).f9834h;
                    if (i3 < i5) {
                        obj = obj3;
                        i3 = i5;
                    }
                    if (i4 == u3) {
                        break;
                    }
                    i4++;
                }
            }
        }
        AbstractC1103Q abstractC1103Q = (AbstractC1103Q) obj;
        int i6 = abstractC1103Q != null ? abstractC1103Q.f9834h : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((AbstractC1103Q) obj2).f9835i;
            int u4 = AbstractC0963o.u(arrayList);
            if (1 <= u4) {
                int i8 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i8);
                    int i9 = ((AbstractC1103Q) obj4).f9835i;
                    if (i7 < i9) {
                        obj2 = obj4;
                        i7 = i9;
                    }
                    if (i8 == u4) {
                        break;
                    }
                    i8++;
                }
            }
        }
        AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) obj2;
        int i10 = abstractC1103Q2 != null ? abstractC1103Q2.f9835i : 0;
        boolean F = interfaceC1096J.F();
        C0809s c0809s = this.f8229a;
        if (F) {
            this.f8230b = true;
            c0809s.f8237a.setValue(new O0.j(l0.c.e(i6, i10)));
        } else if (!this.f8230b) {
            c0809s.f8237a.setValue(new O0.j(l0.c.e(i6, i10)));
        }
        return interfaceC1096J.C(i6, i10, C0971w.f9166h, new D.O(11, arrayList));
    }

    @Override // r0.InterfaceC1094H
    public final int h(Z z3, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC1093G) list.get(0)).a0(i2));
            int u3 = AbstractC0963o.u(list);
            int i3 = 1;
            if (1 <= u3) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC1093G) list.get(i3)).a0(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == u3) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
