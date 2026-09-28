package A0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f63a = new AtomicInteger(0);

    public static final V.o a(V.o oVar, y2.c cVar) {
        return oVar.k(new ClearAndSetSemanticsElement(cVar));
    }

    public static final V.o b(V.o oVar, boolean z3, y2.c cVar) {
        return oVar.k(new AppendedSemanticsElement(cVar, z3));
    }
}
