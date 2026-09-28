package n1;

import androidx.lifecycle.X;
import androidx.lifecycle.b0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class m extends X {

    /* renamed from: c, reason: collision with root package name */
    public static final l f9059c = new l();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9060b = new LinkedHashMap();

    @Override // androidx.lifecycle.X
    public final void d() {
        LinkedHashMap linkedHashMap = this.f9060b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f9060b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        z2.h.e(sb2, "sb.toString()");
        return sb2;
    }
}
