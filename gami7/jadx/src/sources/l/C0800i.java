package l;

import java.util.List;
import java.util.NoSuchElementException;
import n2.AbstractC0963o;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.Z;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800i implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final C0805n f8217a;

    public C0800i(C0805n c0805n) {
        this.f8217a = c0805n;
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
        AbstractC1103Q abstractC1103Q;
        AbstractC1103Q abstractC1103Q2;
        int i2;
        int i3;
        int i4;
        int size = list.size();
        AbstractC1103Q[] abstractC1103QArr = new AbstractC1103Q[size];
        int size2 = list.size();
        long j4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            abstractC1103Q = null;
            if (i6 >= size2) {
                break;
            }
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list.get(i6);
            Object p3 = interfaceC1093G.p();
            C0802k c0802k = p3 instanceof C0802k ? (C0802k) p3 : null;
            if (c0802k != null && ((Boolean) c0802k.f8218b.getValue()).booleanValue()) {
                AbstractC1103Q a3 = interfaceC1093G.a(j3);
                long e3 = l0.c.e(a3.f9834h, a3.f9835i);
                abstractC1103QArr[i6] = a3;
                j4 = e3;
            }
            i6++;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list.get(i7);
            if (abstractC1103QArr[i7] == null) {
                abstractC1103QArr[i7] = interfaceC1093G2.a(j3);
            }
        }
        if (interfaceC1096J.F()) {
            i3 = (int) (j4 >> 32);
        } else {
            if (size == 0) {
                abstractC1103Q2 = null;
            } else {
                abstractC1103Q2 = abstractC1103QArr[0];
                int i8 = size - 1;
                if (i8 != 0) {
                    int i9 = abstractC1103Q2 != null ? abstractC1103Q2.f9834h : 0;
                    int i10 = new E2.d(1, i8, 1).f1077i;
                    boolean z3 = 1 <= i10;
                    int i11 = z3 ? 1 : i10;
                    while (z3) {
                        if (i11 != i10) {
                            i2 = i11 + 1;
                            z3 = z3;
                        } else {
                            if (!z3) {
                                throw new NoSuchElementException();
                            }
                            z3 = false;
                            i2 = i11;
                        }
                        AbstractC1103Q abstractC1103Q3 = abstractC1103QArr[i11];
                        int i12 = abstractC1103Q3 != null ? abstractC1103Q3.f9834h : 0;
                        if (i9 < i12) {
                            abstractC1103Q2 = abstractC1103Q3;
                            i11 = i2;
                            i9 = i12;
                        } else {
                            i11 = i2;
                        }
                    }
                }
            }
            i3 = abstractC1103Q2 != null ? abstractC1103Q2.f9834h : 0;
        }
        if (interfaceC1096J.F()) {
            i5 = (int) (4294967295L & j4);
        } else {
            if (size != 0) {
                abstractC1103Q = abstractC1103QArr[0];
                int i13 = size - 1;
                if (i13 != 0) {
                    int i14 = abstractC1103Q != null ? abstractC1103Q.f9835i : 0;
                    int i15 = new E2.d(1, i13, 1).f1077i;
                    boolean z4 = 1 <= i15;
                    int i16 = z4 ? 1 : i15;
                    while (z4) {
                        if (i16 != i15) {
                            i4 = i16 + 1;
                            z4 = z4;
                        } else {
                            if (!z4) {
                                throw new NoSuchElementException();
                            }
                            z4 = false;
                            i4 = i16;
                        }
                        AbstractC1103Q abstractC1103Q4 = abstractC1103QArr[i16];
                        int i17 = abstractC1103Q4 != null ? abstractC1103Q4.f9835i : 0;
                        i16 = i4;
                        if (i14 < i17) {
                            abstractC1103Q = abstractC1103Q4;
                            i14 = i17;
                        }
                    }
                }
            }
            if (abstractC1103Q != null) {
                i5 = abstractC1103Q.f9835i;
            }
        }
        if (!interfaceC1096J.F()) {
            this.f8217a.f8227c.setValue(new O0.j(l0.c.e(i3, i5)));
        }
        return interfaceC1096J.C(i3, i5, C0971w.f9166h, new C0799h(abstractC1103QArr, this, i3, i5));
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
