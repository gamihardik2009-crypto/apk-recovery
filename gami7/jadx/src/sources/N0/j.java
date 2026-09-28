package N0;

import B1.C;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f4993b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f4994c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f4995d = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f4996a;

    public j(int i2) {
        this.f4996a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f4996a == ((j) obj).f4996a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4996a;
    }

    public final String toString() {
        int i2 = this.f4996a;
        if (i2 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + C.Q(arrayList, ", ") + ']';
    }
}
