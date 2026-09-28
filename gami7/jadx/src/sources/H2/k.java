package H2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m2.C0865g;

/* loaded from: classes.dex */
public final class k extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f3442i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f3443j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, boolean z3) {
        super(2);
        this.f3442i = list;
        this.f3443j = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2;
        boolean z3;
        Object obj3;
        C0865g c0865g;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        z2.h.f(charSequence, "$this$$receiver");
        List list = this.f3442i;
        boolean z4 = this.f3443j;
        if (z4 || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            boolean z5 = charSequence instanceof String;
            int i3 = new E2.d(intValue, charSequence.length(), 1).f1077i;
            if (z5) {
                if (intValue <= i3) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str = (String) obj4;
                            if (l.Y(str, 0, (String) charSequence, intValue, str.length(), z4)) {
                                break;
                            }
                        }
                        String str2 = (String) obj4;
                        if (str2 == null) {
                            if (intValue == i3) {
                                break;
                            }
                            intValue++;
                        } else {
                            c0865g = new C0865g(Integer.valueOf(intValue), str2);
                            break;
                        }
                    }
                }
                c0865g = null;
            } else {
                if (intValue <= i3) {
                    int i4 = intValue;
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = i3;
                                z3 = z4;
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str3 = (String) obj3;
                            i2 = i3;
                            z3 = z4;
                            if (l.Z(str3, 0, charSequence, i4, str3.length(), z4)) {
                                break;
                            }
                            z4 = z3;
                            i3 = i2;
                        }
                        String str4 = (String) obj3;
                        if (str4 == null) {
                            if (i4 == i2) {
                                break;
                            }
                            i4++;
                            z4 = z3;
                            i3 = i2;
                        } else {
                            c0865g = new C0865g(Integer.valueOf(i4), str4);
                            break;
                        }
                    }
                }
                c0865g = null;
            }
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = (String) list.get(0);
            int U3 = l.U(charSequence, str5, intValue, false, 4);
            if (U3 >= 0) {
                c0865g = new C0865g(Integer.valueOf(U3), str5);
            }
            c0865g = null;
        }
        if (c0865g == null) {
            return null;
        }
        return new C0865g(c0865g.f8646h, Integer.valueOf(((String) c0865g.f8647i).length()));
    }
}
