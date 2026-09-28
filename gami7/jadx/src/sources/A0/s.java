package A0;

import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import m2.InterfaceC0861c;
import n2.AbstractC0961m;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class s extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final s f78j = new s(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final s f79k = new s(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final s f80l = new s(2, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final s f81m = new s(2, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final s f82n = new s(2, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final s f83o = new s(2, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final s f84p = new s(2, 6);
    public static final s q = new s(2, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final s f85r = new s(2, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final s f86s = new s(2, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final s f87t = new s(2, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final s f88u = new s(2, 11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i2, int i3) {
        super(i2);
        this.f89i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        String str;
        InterfaceC0861c interfaceC0861c;
        switch (this.f89i) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList Y2 = AbstractC0961m.Y(list);
                Y2.addAll(list2);
                return Y2;
            case 1:
                return (C0880v) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case AbstractC1166e.f10138f /* 5 */:
                h hVar = (h) obj;
                int i2 = ((h) obj2).f30a;
                return hVar;
            case AbstractC1166e.f10136d /* 6 */:
                return (String) obj;
            case 7:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList Y3 = AbstractC0961m.Y(list3);
                Y3.addAll(list4);
                return Y3;
            case 8:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case AbstractC1166e.f10135c /* 9 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case AbstractC1166e.f10137e /* 10 */:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f16a) == null) {
                    str = aVar2.f16a;
                }
                if (aVar == null || (interfaceC0861c = aVar.f17b) == null) {
                    interfaceC0861c = aVar2.f17b;
                }
                return new a(str, interfaceC0861c);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
