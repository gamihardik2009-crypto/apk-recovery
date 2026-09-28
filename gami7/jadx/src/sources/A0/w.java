package A0;

import C0.C0024g;
import n2.AbstractC0962n;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F2.d[] f123a;

    static {
        z2.j jVar = new z2.j("stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;");
        z2.t.f11910a.getClass();
        f123a = new F2.d[]{jVar, new z2.j("progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new z2.j("paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new z2.j("liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new z2.j("focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new z2.j("isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new z2.j("isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new z2.j("contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new z2.j("contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new z2.j("traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new z2.j("horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new z2.j("verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new z2.j("role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new z2.j("testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new z2.j("textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new z2.j("isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new z2.j("editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new z2.j("textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new z2.j("imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new z2.j("selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new z2.j("collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new z2.j("collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new z2.j("toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new z2.j("isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new z2.j("maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new z2.j("customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};
        x xVar = t.f95a;
        x xVar2 = j.f35a;
    }

    public static final x a(String str) {
        x xVar = new x(str);
        xVar.f126c = true;
        return xVar;
    }

    public static final x b(String str, y2.e eVar) {
        return new x(str, true, eVar);
    }

    public static void c(k kVar, y2.c cVar) {
        kVar.e(j.f35a, new a(null, cVar));
    }

    public static final void d(k kVar, String str) {
        x xVar = t.f95a;
        kVar.e(t.f95a, AbstractC0962n.l(str));
    }

    public static final void e(k kVar) {
        x xVar = t.f104j;
        F2.d dVar = f123a[3];
        xVar.a(kVar, new f());
    }

    public static final void f(k kVar, int i2) {
        x xVar = t.f112s;
        F2.d dVar = f123a[12];
        xVar.a(kVar, new h(i2));
    }

    public static final void g(k kVar, C0024g c0024g) {
        x xVar = t.f95a;
        kVar.e(t.f114u, AbstractC0962n.l(c0024g));
    }

    public static final void h(k kVar) {
        x xVar = t.f106l;
        F2.d dVar = f123a[6];
        xVar.a(kVar, Boolean.TRUE);
    }
}
